package 第十章;

/**
 * Created by lh on 17-7-17.
 * Create an interface U with three methods.
 * Create a class A with a method that produces a
 * reference to a U by building an anonymous
 * inner class. Create a second class B that
 * contains an array of U. B should have one
 * method that accepts and store a reference to
 * ａ　U in the array, a second method that sets a
 * reference in the array (specified by the
 * method argument) to null, and a third method
 * that move through the array an calls the
 * methods in U. In main(),create a group of A
 * Objects and a single B, Fill the B with U
 * references produced by the A objects. Use the
 * B to call back into all the A objects.Remoev
 * some fo the U references from the B.
 */
interface U {
    void f();

    void g();

    void h();
}

class A1 {
    public U getU() {
        return new U() {
            @Override
            public void f() {
                System.out.println("A.f");
            }

            @Override
            public void g() {
                System.out.println("A.g");
            }

            @Override
            public void h() {
                System.out.println("A.h");
            }
        };
    }
}

class B1 {
    U[] ua;

    public B1(int size) {
        ua = new U[size];
    }

    public boolean add(U elem) {
        for (int i = 0; i < ua.length; i++) {
            if (ua[i] == null) {
                ua[i] =elem;
                return true;
            }
        }
        return true;
    }

    public boolean setNUll(int i) {
        if (i < 0 || i >= ua.length) {
            return false; // Value out of bounds
        }
        ua[i] = null;
        return true;
    }

    public void callMethods() {
        for (int i = 0; i < ua.length; i++) {
            if (ua[i] != null) {
                ua[i].f();
                ua[i].g();
                ua[i].h();
            }
        }
    }
}

public class E23_UAB {
    public static void main(String[] args) {
        A1[] aa = {new A1(),new A1(),new A1()};
        B1 b1 = new B1(3);
        for (int i = 0; i < aa.length; i++) {
            b1.add(aa[i].getU());
        }
        b1.callMethods();
        System.out.println("*****");
        b1.setNUll(0);
        b1.callMethods();
    }

}
