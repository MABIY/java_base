package 第二章.练习题;

/**
 * Created by lh on 17-5-25.
 */
class StaticTest8 {
    static int i = 47;
}

class Incrementable8 {
    static void increment() {
        StaticTest8.i++;
    }
}
public class Practice_8 {
    public static void main(String[] args) {
        System.out.println("StaticTest.i=" + StaticTest.i);
        StaticTest st1 = new StaticTest();
        StaticTest st2 = new StaticTest();
        System.out.println("st1.i=" + st1.i);
        System.out.println("st2.i=" + st2.i);
        Incrementable.increment();
        System.out.println("After Incrementable.increment() called: ");
        System.out.println("st1.i = " + st1.i);
        System.out.println("st2.i = " + st2.i);
        Incrementable.increment();
        System.out.println("After Incrementable.increment called :");
        System.out.println("st1.i = " + st1.i);
        System.out.println("st2.i = " + st2.i);
        st1.i = 3;
        System.out.println("After st1.i = 3, ");
        System.out.println("st1.i = " + st1.i);
        System.out.println("st2.i = " + st2.i);
        System.out.println("Create another StaticTest, st2.");
        StaticTest st3 = new StaticTest();
        System.out.println("st3.i = " + st3.i);
    }
}
