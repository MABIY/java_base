package 第四章;

import static net.mindview.util.Print.print;

/**
 * Created by lh on 17-6-19.
 */
public class IfElse2 {
    public static void main(String[] args) {
        print(test(10, 5));
        print(test(5, 10));
        print(test(5,5));
    }

    private static Object test(int testval, int target) {
        if (testval > target) {
            return +1;
        } else if (testval < target) {
            return -1;
        } else {
            return 0; // Match
        }
    }
}
