package 十二章;

/**
 * Created by lh on 17-8-1.
 * Rethrow  a different object from the one that was caught
 */
class OneException extends Exception {
    public OneException(String s) {
        super(s);
    }
}

class TwoException extends Exception {
    public TwoException(String message) {
        super(message);
    }
}
public class RethrowNew {
    public static void f() throws OneException {
        System.out.println("originating the exception in f()");
        throw new OneException("thrown from f()");
    }

    public static void main(String[] args) {
        try {
            try {
                f();
            } catch (OneException e) {
                System.out.println("Caught in inner try,e.printStackTrace()");
                e.printStackTrace(System.out);
                throw new TwoException("From inner try");
            }
        } catch (TwoException e) {
            System.out.println("Cautht in outer try. e.printStackTrac()");
            e.printStackTrace(System.out);
        }
    }
}
