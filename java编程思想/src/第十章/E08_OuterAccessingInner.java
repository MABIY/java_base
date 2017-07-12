package 第十章;

/**
 * Created by lh on 17-7-12.
 * Determine whether an outer class has a access to
 * the private elements of its inner class.
 */
class Outer4 {
    class Inner {
        private int j;

        private void h() {
            System.out.println("Inner.h called");
            System.out.println("Inner.j = " + j);
        }
    }

    public void testInnerAccess() {
        Inner i = new Inner();
        i.h();
        i.j = 47;
        i.h();
    }
}
public class E08_OuterAccessingInner {
    public static void main(String[] args) {
        Outer4 o = new Outer4();
        o.testInnerAccess();
    }
}
