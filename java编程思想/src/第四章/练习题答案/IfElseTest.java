package 第四章.练习题答案;

import static net.mindview.util.Print.print;

/**
 * Created by lh on 17-6-19.
 */
public class IfElseTest {
    public static void main(String[] args) {
        print(test(10,5,4));
        print(test(5,4,10));
        print(test(5, 5, 6));
        print(test(10, 5, 7));
        print(test(5,5,5));
    }

    private static Object test(int testval, int begin, int end) {
        if (end > begin) {
            print("end cannot be < begin");
        }
        if ((testval > (begin - 1)) && (testval < (end + 1))) {
            return +1;
        }
        if ((testval < begin) || (testval > end)) {
            return -1;
        }
        print("exceptional case");
        return 13;
    }
}
