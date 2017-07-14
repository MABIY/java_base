package 第十章;

import static net.mindview.util.Print.print;

/**
 * Created by lh on 17-7-14.
 * Create a constructor for an anonymous inner class.
 */
abstract class Base {
    private int a =3;
    public Base(int i) {
        print("Base constructor . i = " + i);
        System.out.println(this);
    }

    public abstract void f();
}
public class AnonymousConstructor {
    public static Base getBase(int i) {
        return new Base(i) {
            private int a=1;
            {
                print("Inside instance initializer");
            }
            @Override
            public void f() {
                print("In anonymous f()");
                System.out.println(super.toString());
            }
        };
    }
    public static void main(String[] args) {
        Base base = getBase(47);
        base.f();
    }
}
