package 第九章;

import java.util.Random;

/**
 * Created by lh on 17-7-3.
 */
public class RandomDoubles {
    private static Random rand = new Random(47);

    public double next() {
        return rand.nextDouble();
    }

    public static void main(String[] args) {
        RandomDoubles rd = new RandomDoubles();
        for (int i = 0; i < 7; i++) {
            System.out.println(rd.next() + " ");
        }
    }
}
