package 第三章;

import static net.mindview.util.Print.print;
/**
 * Created by lh on 17-6-16.
 */
public class ShortCircuit {
    static boolean test1(int val) {
        print("test1(" + val + ")");
        print("result: " + (val < 1));
        return val < 1;
    }
    static boolean test2(int val) {
        print("text2(" + val + ")");
        print("result: " + (val < 2));
        return val < 2;
    }

    static boolean test3(int val) {
        print("test3 " + val + ")");
        print("result: " + (val < 3));
        return val < 3;
    }

    public static void main(String[] args) {
//        boolean b = test1(0) && test2(2) && test3(2);
//        print("expression is " + b);
        boolean b1 = test1(0) & test2(2) & test3(2);
        print("expression is " + b1);
    }
}
