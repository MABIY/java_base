package 第五章;

import java.util.Arrays;

/**
 * Created by lh on 17-6-22.
 */
public class ArrayInit {
    public static void main(String[] args) {
        Integer[] a = {
                new Integer(1),
                new Integer(2),
                3,
        };
        Integer[] b = new Integer[]{
                new Integer(1),
                new Integer(2),
                3,
        };
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));
    }

}
