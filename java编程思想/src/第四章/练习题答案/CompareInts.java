package 第四章.练习题答案;

import java.util.Random;

import static net.mindview.util.Print.print;

/**
 * Created by lh on 17-6-18.
 */
public class CompareInts {
    public static void main(String[] args) {
        Random random = new Random();
        Random random1 = new Random();
        for (int i = 0; i < 25; i++) {
            int x = random.nextInt();
            int y = random.nextInt();
            if (x < y) {
                print(x + " < " + y);
            } else {
                if (x > y) {
                    print(x + " > " + y);
                } else {
                    print(x + " = " + y);
                }
            }
        }

        Random random2 = new Random();
        Random random3 = new Random();

        for (int i = 0; i < 25; i++) {
            int x = random2.nextInt(10);
            int y = random3.nextInt(10);
            if (x < y) {
                print(x + " < " + y);
            } else if (x > y) {
                print(x + " >" + y);
            } else {
                print(x + " = " + y);
            }
        }









    }
}
