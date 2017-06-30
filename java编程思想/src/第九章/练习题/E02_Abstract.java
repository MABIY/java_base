package 第九章.练习题;

/**
 * Created by lh on 17-6-30.
 * Create a class as abstract without including
 * any abstarct methods , and verify that you
 * cannot create any instances of that class
 */
abstract class NoAbstractMethods {
    void f() {
        System.out.println("f()");
    }
}
public class E02_Abstract {
    public static void main(String[] args) {
//        new NoAbstractMethods();
    }
}
