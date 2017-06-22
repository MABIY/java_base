package 第五章.练习题答案;

/**
 * Created by lh on 17-6-22.
 */
class Tank {
    int howFull = 0;

    Tank() {
        this(0);
    }

    public Tank(int i) {
        howFull = i;
    }

    void sayHowFull() {
        if (howFull == 0) {
            System.out.println("Tank is empty");
        } else {
            System.out.println("Tank filling status = " + howFull);
        }
    }

    void empty() {
        howFull = 0;
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        if (howFull == 0) {
            System.out.println("Error: Tank not empty");
        }
    }
}

public class TankTest {
    public static void main(String[] args) {
        Tank tank = new Tank();
        Tank tank1 = new Tank(3);
        Tank tank2 = new Tank(5);
        //Proper clenaup : mepty tank before going home
        tank2.empty();
        //Drop the refereence, forget to cleanup;
        new Tank(6);
        System.out.println("Check tanks:");
        System.out.println("tank: ");
        tank.sayHowFull();
        System.out.println("tank1: ");
        tank1.sayHowFull();
        System.out.println("tank2 ");
        tank2.sayHowFull();
        System.out.println("force forced gc()");
        System.gc();
        //Force finalization  on exit but using method
        // deprecated since JDK 1.1
        System.out.println("try deprecated runFinalizersOnExit(true)");
        System.runFinalizersOnExit(true);
        System.out.println("last forced gc()");
        System.gc();
    }
}

























