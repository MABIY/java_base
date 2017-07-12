package 第十章;

import 第十章.exercise.SimpleInterface;

/**
 * Created by lh on 17-7-12.
 * Create an interface with at least one method,
 * and implement it by defining an
 * inner class within a method that return a
 * reference to your interface.
 */
public class E09_InnerClassInMethod {
    public SimpleInterface get() {
        class SI implements SimpleInterface {
            @Override
            public void f() {
                System.out.println("SI.f");
            }
        }
        return new SI();
    }

    public static void main(String[] args) {
        SimpleInterface si = new E09_InnerClassInMethod().get();
        si.f();
    }
}
