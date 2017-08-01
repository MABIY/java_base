package 十二章;

import static net.mindview.util.Print.print;

/**
 * Created by lh on 17-8-1.
 */
class MyException3 extends Exception {
    private int x;
    public MyException3() {

    }

    public MyException3(String msg) {
      super(msg);
    }

    public int val() {
        return x;
    }

    public MyException3(String msg, int x) {
        super(msg);
        this.x = x;
    }

    public String getMessage() {
        return "Detail Message: " + x + " " + super.getMessage();
    }
}
public class ExtraFeatures extends Exception {
    public static void f() throws MyException3 {
        print("THrowing MyException2 from f()");
        throw new MyException3();
    }

    public static void g() throws MyException3 {
        print("Throwing MyException3 from g()");
        throw new MyException3("Originated in g()");
    }

    public static void h() throws MyException3 {
        print("Throwing MyException3 from h()");
        throw new MyException3("Originated in h()",47);
    }

    public static void main(String[] args) {
        try {
            f();
        } catch (MyException3 myException3) {
            myException3.printStackTrace(System.out);
        }
        try {
            g();
        } catch (MyException3 myException3) {
            myException3.printStackTrace(System.out);
        }
        try {
            h();
        } catch (MyException3 myException3) {
            myException3.printStackTrace(System.out);
            System.out.println("e.val() = " + myException3.val());
        }
    }
}
