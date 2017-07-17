package 第十章;

/**
 * Created by lh on 17-7-17.
 * Create an interface with a nested class.
 * and as static method that calls the methods
 * of your interface and displays the results.
 * Implement your interface and pass an instance of
 * your implementation to the method
 */
interface I {
    String a = "1";

    void f();

    void g();

    class Nested {
        static void call(I impl) {
            System.out.println("Calling I.f()");
            impl.f();
            System.out.println("Calling I.g()");
            impl.g();
        }
    }

}

public class E21_InterfaceWithNested2 {
    public static void main(String[] args) {
        I impl = new I() {
            @Override
            public void f() {

            }

            @Override
            public void g() {

            }
        };

        I.Nested.call(impl);
    }
}
