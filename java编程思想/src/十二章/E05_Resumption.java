package 十二章;

/**
 * Created by lh on 17-7-31.
 * Create your own resumption-like behavior using
 * a while loop that repeats until an exception
 * is no longer  thrown.
 */
class ResumerException extends Exception {
}
class Resumer {
    static int count = 3;
    static void f() throws ResumerException {
        if (--count > 0) {
            throw new ResumerException();
        }
    }
}
public class E05_Resumption {
    public static void main(String[] args) {
        while (true) {
            try {
                Resumer.f();
            } catch (ResumerException e) {
                System.out.println("Caught " + e);
                continue;
            }
            System.out.println("Got throught...");
            break;
        }
        System.out.println("Successful execution");
    }
}
