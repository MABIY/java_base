package 十二章;

/**
 * Created by lh on 17-8-2.
 * Demonstrate that a derived-class constructor
 * cannot catch exceptions thrown by this
 * by-class constructor
 */
class Exception1 extends Exception {
    public Exception1(String s) {
        super(s);
    }
}

class BaseWithException {
    public BaseWithException() throws Exception1 {
        throw new Exception1("thrown by BaseWithException");
    }
}

class DerivedWE extends BaseWithException {
    // Produces compile-time error:
    /// unreported exception Except1
//    public DerivedWE() {
//    }
    //Give compile error: call to super must be
    //first statement in constructor
//    public DerivedWE() {
//        try {
//            super();
//        } catch (Exception1 exception1) {
//
//        }
//    }
    public DerivedWE() throws Exception1 {
    }
}

public class E21_ConstructorExceptions {
    public static void main(String[] args) {
        try {
            new DerivedWE();
        } catch (Exception1 exception1) {
            System.out.println("Caught " + exception1);
        }
    }





















}
