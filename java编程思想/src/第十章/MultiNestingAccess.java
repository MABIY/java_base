package 第十章;

/**
 * Created by lh on 17-7-17.
 * Nested classes can access all members of all
 * levels of the classes they are nested within
 */
class MNA {
    private void f() {

    }

    class A {
        private void g() {

        }

        public class B {
            void h() {
                MNA.A.this.g();
                MNA.this.f();
            }
        }
    }
}

public class MultiNestingAccess {
    public static void main(String[] args) {
        MNA mna = new MNA();
        MNA.A mnaa = mna.new A();
        MNA.A.B mnaab = mnaa.new B();
        mnaab.h();

    }
}
