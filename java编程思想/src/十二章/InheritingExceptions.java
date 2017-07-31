package 十二章;

import 第十章.exercise.SimpleClass;

/**
 * Created by lh on 17-7-31.
 * Creating your own exceptions
 */
class SimpleException extends Exception {

}
public class InheritingExceptions {
    public void f() throws SimpleException {
        System.out.println("Throw SimpleExcepiton form f()");
        throw new SimpleException();
    }

    public static void main(String[] args) {
        InheritingExceptions sed = new InheritingExceptions();
        try {
            sed.f();
        } catch (SimpleException e) {
            System.out.println("Caught it!");
        }
    }
}
