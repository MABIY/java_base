package 第十章;

import 第十章.exercise.SimpleInterface;

/**
 * Created by lh on 17-7-14.
 * Repeat Exercise 9 using an anonymous inner
 * class.
 */
public class E13_AnonymousInnerClassMethod {
    public SimpleInterface get() {
        return new SimpleInterface() {
            @Override
            public void f() {
                System.out.println("SimpleInterface.f");
            }
        };
    }

    public static void main(String[] args) {
        SimpleInterface si = new E13_AnonymousInnerClassMethod().get();
        si.f();
    }
}
