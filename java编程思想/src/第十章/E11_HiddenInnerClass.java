package 第十章;

import 第十章.exercise.SimpleInterface;

/**
 * Created by lh on 17-7-12.
 * Create a private inner class that implements a
 * public interface.Write a method that returns
 * a reference to an instance of the  private
 * inner class, upcast to the interface. Show
 * that the inner class is completely hidden by
 * trying to downcast to it.
 */
class Outer5 {
    private class Inner implements SimpleInterface {
        @Override
        public void f() {
            System.out.println("Outer5.Inner.f");
        }
    }

    public SimpleInterface get() {
        return new Inner();
    }

    public Inner get2() {
        return new Inner();
    }
}

public class E11_HiddenInnerClass {
    public static void main(String[] args) {
        Outer5 out = new Outer5();
        SimpleInterface si = out.get();
        si = out.get2();
/*        Inner i1 = out.get2();
        Inner i2 = (Inner)si;*/
    }
}

