package 第十章;

/**
 * Created by lh on 17-7-12.
 * Create a class with a private field and a
 * private method.Create an inner class with a
 * method that modifies the outer-class field and
 * call the outer-class method. create an object of the
 * inner class and call its method, then show
 * the effect on the outer-class object.
 */
public class E07_InnerClassAccess {
    private int i =10;

    private void f() {
        System.out.println("E07_InnerClassAccess.f");
    }

    class Inner {
        void g() {
            i++;
            f();
        }
    }

    public void h() {
        System.out.println("i = " + i);
        Inner in = new Inner();
        in.g();
        System.out.println("i = " + i);
    }

    public static void main(String[] args) {
        E07_InnerClassAccess ica = new E07_InnerClassAccess();
        ica.h();
    }
}
