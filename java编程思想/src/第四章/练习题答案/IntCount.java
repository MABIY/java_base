package 第四章.练习题答案;

import static net.mindview.util.Print.print;

/**
 * Created by lh on 17-6-19.
 */
public class IntCount {
    public static void main(String[] args) {
        count1(100);
        count2(100);
        count3(100);
    }

    private static void count3(int i) {
        for (int j = 0; j < i; j++) {
            print(i + 1);
            if (i == 99) {
                return;
            }
        }
    }

    private static void count2(int i) {
        for (int j = 0; j < i; j++) {
            print(i + 1);
            if (i == 99) {
                break;
            }
        }
    }

    private static void count1(int i) {
        for (int j = 0; j < i; j++) {
            print(i + 1);
        }
    }

}
