package 第五章;

import static net.mindview.util.Print.print;

/**
 * Created by lh on 17-6-22.
 */
public class ArraysOfPrimitives {
    public static void main(String[] args) {
        int[] a1 = {1, 2, 3, 4, 5};
        int[] a2;
        a2 = a1;
        for (int i = 0; i < a2.length; i++) {
            a2[i] = a2[i] + i;
        }
        for (int i = 0; i < a1.length; i++) {
            print("a1["+i+"]" + a1[i]);
        }
    }
}
