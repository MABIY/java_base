package 第十章;

/**
 * Created by lh on 17-7-11.
 * Qualifying access to the outer-class object.
 */
public class DotThis {
    void f() {
        System.out.println("DotThis.f()");
    }

    public class Inner {
        public class Inner1 {
            public Inner outer() {
                return DotThis.Inner.this;
            }
        }

        public DotThis outer() {
            return DotThis.this;
            // A plain "this"   would be Inner's "this"
        }
    }

    public Inner inner() {
        return new Inner();
    }

    public static void main(String[] args) {
        DotThis dt = new DotThis();
        DotThis.Inner inner = dt.inner();
        DotThis.Inner.Inner1 inner1 = inner.new Inner1();
        inner1.outer().outer().f();
    }
}
