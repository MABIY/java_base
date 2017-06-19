package 第四章.练习题答案;

/**
 * Created by lh on 17-6-19.
 */
public class Fibonacci {

    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            System.out.println(soun(i));
        }
    }

    private static int soun(int i) {
        if (i < 2) {
            return 1;
        } else {
             return soun(i - 1) + soun(i - 2);
        }

    }
}
