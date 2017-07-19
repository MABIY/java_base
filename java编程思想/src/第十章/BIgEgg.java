package 第十章;

import static net.mindview.util.Print.print;

/**
 * Created by lh on 17-7-19.
 * An inner class cannot be overriden like a method
 */
class Egg {
    private Yolk y;

    protected class Yolk {
        public Yolk() {
            print("Egg.Yolk");
            f();
        }
    }

    public Egg() {
        print("New Egg()");
        y = new Yolk();

    }
    protected void f() {
        System.out.println("Egg.f");
    }

}

public class BIgEgg extends Egg {
    protected class Yolk {
        public Yolk() {
            print("BigEgg.Yolk()");
        }
    }

    @Override
    protected void f() {
        System.out.println("BigEgg.f");
    }

    public static void main(String[] args) {
        new BIgEgg();
    }
}
