package 第五章;

import java.util.Arrays;
import java.util.Random;

import static net.mindview.util.Print.print;

/**
 * Created by lh on 17-6-22.
 */
public class ArrayNew {
    public static void main(String[] args) {
        int[] a;
        Random rand = new Random(47);
        a = new int[rand.nextInt(20)];
        print("lenght of a = " + a.length);
        print(Arrays.toString(a));
    }
}
