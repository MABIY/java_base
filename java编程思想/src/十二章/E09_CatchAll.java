package 十二章;

/**
 * Created by lh on 17-8-1.
 * Create three new types of exceptions. Write a
 * class with a method that throws all three. In
 * main(),call thee method but only use a single
 * catch clause that will catch all three types
 * of exceptions
 */
class ExBase extends Exception {
}

class Ex1 extends ExBase {

}

class Ex2 extends ExBase {

}

class Ex3 extends ExBase {

}

class Throwr2 {
    void f() throws Ex1 ,Ex2,Ex3{
        throw new Ex1();
        //You aren't forced to throw all the
        //Exceptions in the specification
    }

}

public class E09_CatchAll {
    public static void main(String[] args) {
        Throwr2 t = new Throwr2();
        try {
            t.f();
        } catch (ExBase exBase) {
            System.out.println("Cautht " + exBase);
        } catch (Exception e) {
            System.out.println("Caught " + e);
        }
    }


















}
