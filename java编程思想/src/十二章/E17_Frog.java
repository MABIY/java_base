package 十二章;

/**
 * Created by lh on 17-8-2.
 * Modify polymorphism/Frog.java so that it uses
 * try-finally to guarantee proper cleanup,and
 * show that this works even if you return from the
 * middle of the try-finally
 */
//Forg.dispose() is protected,cannot be called directly
class Frog2 extends Frog {
    protected void dispaly() {
        super.dispose();
    }
}

public class E17_Frog {
    public static void main(String[] args) {
        Frog2 frog2 = new Frog2();
        try {
            // No return in the middle....
        } finally {
            System.out.println("----------");
            frog2.dispaly();
        }
        System.out.println("0000000000");
        frog2 = new Frog2();
        try {
            //With return in the middle....
            return;
        } finally {
            System.out.println("2 finally----------");
            frog2.dispaly();
        }

    }
}
