package 第四章;

import static net.mindview.util.Print.print;

/**
 * Created by lh on 17-6-18.
 */
public class IfElse {
    static int result = 0;

    static void test(int testval, int target) {
        if (testval > target) {
            result = +1;
        } else if (testval < target) {
            result = -1;
        } else {
            result = 0 ; // Match
        }
    }
    public static void main(String[]args) {
        test(10, 5);
        print(result);
        test(5, 10);
        print(result);
        test(5, 5);
        print(result);
    }
}
