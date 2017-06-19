package 第四章;

import java.util.Random;

/**
 * Created by lh on 17-6-19.
 */
public class ForEachFloat {
    public static void main(String[] args) {
        Random random = new Random(47);
        float f[] = new float[10];
        for (int i = 0; i < 10; i++) {
            f[i] = random.nextFloat();
        }
        for (float x : f) {
            System.out.println(x);
        }
    }
}
