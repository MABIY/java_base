package 第五章;

import java.util.Arrays;
import java.util.Random;

import static net.mindview.util.Print.print;

/**
 * Created by lh on 17-6-22.
 */
public class ArrayClassObj {
    public static void main(String[] args) {
        Random rand = new Random(47);
        Integer[] a = new Integer[rand.nextInt(20)];
        print("lenght of a = " + a.length);
        for (int i = 0; i < a.length; i++) {
            a[i] = rand.nextInt(500); //Autoboxing
        }
        print(Arrays.toString(a));
    }
}
