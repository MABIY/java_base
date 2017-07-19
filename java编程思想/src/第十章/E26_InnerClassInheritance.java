package 第十章;

/**
 * Created by lh on 17-7-19.
 * Create a class with an inner class that has a
 * non-defualt constructor(one that takes arguments).
 * Create a second class with an inner class that inherits
 * from the first inner class.
 */
class WithNonDefault {
    class Inner {
        int i ;

        public Inner(int i) {
            this.i = i;
        }

        public Inner() {
            i = 47;
        }

        public void f() {
            System.out.println("Inner.f");
        }
    }
}
public class E26_InnerClassInheritance {
    class Inner2 extends WithNonDefault.Inner {
       public Inner2(WithNonDefault wnd,int i) {
           wnd.super(i);
       }

       @Override
       public void f() {
           System.out.println("Inner2.f");
           super.f();
       }
    }

    public static void main(String[] args) {

        WithNonDefault wnd = new WithNonDefault();
        E26_InnerClassInheritance ici = new E26_InnerClassInheritance();
        Inner2 i2 = ici.new Inner2(wnd,47);
        i2.f();
    }
}
