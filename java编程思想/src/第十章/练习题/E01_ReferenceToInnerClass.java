package 第十章.练习题;

/**
 * Created by lh on 17-7-4.
 * Write a class named Outer containing an
 * inner class named Inner. Add a method to Outer
 * that returns an object of type Inner.In
 * main(),create and initialize a reference to
 * an Inner
 */
class Outer {
    class Inner {
        {
            System.out.println("Inner created");
        }
    }

    Inner getInner() {
        return new Inner();
    }
}
public class E01_ReferenceToInnerClass {
    public static void main(String[] args) {
        Outer o = new Outer();
        Outer.Inner i = o.getInner();
    }
}
