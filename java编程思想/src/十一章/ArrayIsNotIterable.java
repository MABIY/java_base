package 十一章;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Iterator;

/**
 * Created by lh on 17-7-30.
 */
public class ArrayIsNotIterable {
    static <T> void test(Iterable<T> ib) {
        for (T t : ib) {
            System.out.println(t + " ");
        }
    }

    public static void main(String[] args) {
        test(Arrays.asList(1, 2, 3));
        String[] strings = {"A","B","C"};
        // An array works in foreach,but it's not iterable
//        test(strings);
        //You must explicitly convert it to an Iterable
        test(Arrays.asList(strings));
    }
}
