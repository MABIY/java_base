package 十二章;

/**
 * Created by lh on 17-8-2.
 * Modify Exercise 9 by adding a finally clause.
 * verify that your finally clause is executed,even
 * if a NullPointerException is thrown
 */
public class E13_Finally {
    public static void throwNull() {
        throw new NullPointerException();
    }

    public static void main(String[] args) {
        Throwr2 t = new Throwr2();
        try {
            t.f();
        } catch (ExBase e) {
            System.out.println("caught " + e);
        } finally {
            System.out.println("In finally clause A");
        }
        try {
            throwNull();
            t.f();
        } catch (ExBase e) {
            System.out.println("Caught " +e);
        } finally {
            System.out.println("In finally clause B");
        }
    }
}
