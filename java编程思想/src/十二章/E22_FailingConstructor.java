package 十二章;

/**
 * Created by lh on 17-8-2.
 * Create a class called FailingConstructor with a
 * constructor that might fail partway throught the
 * construction process and throw an exception.In
 * main(),write code that properly guards against
 * this failure
 */
class ConstructionException1 extends Exception {
}

class FailingConstructor {
    FailingConstructor(boolean fail) throws ConstructionException {
        if (fail) {
            throw new ConstructionException();
        }
    }
}

public class E22_FailingConstructor {
    public static void main(String[] args) {
        for (boolean b = false; ; b = !b) {
            try {
                System.out.println("Constructing....");
                FailingConstructor fc = new FailingConstructor(b);
                try {
                    System.out.println("Processing....");
                } finally {
                    System.out.println("Cleanup.....");
                }
            } catch (ConstructionException e) {
                System.out.println("Construction has failed: " + e);
                break;
            }
        }
    }
}
