package 十二章;

/**
 * Created by lh on 17-8-2.
 * ********************Exercise 28********************
 * Modify Exersice 4 so that custom exception
 * class inherits from runtimeException, and show
 * that the compiler allows you to leave out the
 * try block
 * ********************
 */
class MyRuntimeException extends RuntimeException {
    public MyRuntimeException(String s) {
        super(s);
    }
}
public class E28_RuntimeExceptionClass {
    public static void main(String[] args) {
        throw new MyRuntimeException("MYRuntimeException msg");
    }
}
