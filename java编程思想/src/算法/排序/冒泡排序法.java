package 算法.排序;

import java.util.Arrays;

/**
 * Created by lh on 17-7-26.
 */
public class 冒泡排序法 {

    public static void main(String[] args) {
        int[] a = {44, 38,11,10,78,19,9,10,323};
        for (int i = 0; i < a.length-1; i++) {
            for (int j = 1; j < a.length-i ; j++) {
                int tmp =0;
                if (a[j - 1] > a[j]) {
                   tmp = a[j] ;
                   a[j]  = a[j -1 ];
                   a[j -1] = tmp;
                }
            }
        }
        System.out.println(Arrays.toString(a));
    }
}
