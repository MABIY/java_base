package 第八章.练习题;

/**
 * Created by lh on 17-6-25.
 */
class A {
    protected void f() {
        System.out.println("A.f()");
        this.g();
    }

    protected void g() {
        System.out.println("A.g()");
    }
}

class B extends A {
    @Override
    protected void g() {
        System.out.println("B.g()");
    }
}

public class Ex10 {
    public static void main(String[] args) {
       B b = new B();
       b.f();
    }
}
