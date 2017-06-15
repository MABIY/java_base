package 第三章;

import static net.mindview.util.Print.print;

/**
 * Created by lh on 17-6-15.
 */
class Box {
    float a;
}
public class PassObject_2 {
    static void f(Box y) {
       y.a = 2.71828f;
    }

    public static void main(String[] args) {
        Box x = new Box();
        x.a = 3.1416f;
        print("1: x.a = " + x.a);
        f(x);
        print("2: x.a = " + x.a);
    }
}
