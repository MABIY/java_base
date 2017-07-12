package 第十章;

/**
 * Created by lh on 17-7-12.
 * Create a class with an inner class, In a
 * Separate class, make an instance of the inner
 * class.
 */
class Outer3 {
    class Inner {
        {
            System.out.println("Inner created");
        }
    }
}
public class E05_InstanceOfInner {
    public static void main(String[] args) {
        Outer3 o = new Outer3();
        Outer3.Inner i = o.new Inner();
    }
}
