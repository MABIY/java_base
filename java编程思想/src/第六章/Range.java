package 第六章;

import java.util.Arrays;

import static com.sun.org.apache.xalan.internal.xsltc.compiler.util.Type.Int;

/**
 * Created by lh on 17-6-23.
 */
public class Range {
    // produce a sequence(0..n)
    public static int[] range(int n) {
        int[] result = new int[n];
        for (int i = 0; i < n; i++) {
            result[i] = i;
        }
        return result;
    }

    // Produce a sequence [start..end]
    public static int[] range(int start, int end) {
        int sz = end - start;
        int reuslt[] = new int[sz];
        for (int i = start; i < end ; i++) {
           reuslt[i-start] = start;
        }
        return reuslt;
    }

    // Produce  a sequence(start...end) incrementing by step
    public static int[] range(int start, int end, int step) {
        int sz =(end  -start )/step + 1;
        int[] result = new int[sz];
        for (int i = 0; i < sz;i++) {
            result[i] = start +step * i;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(range(10)));
        System.out.println(Arrays.toString(range(1,3)));
        System.out.println(Arrays.toString(range(1,10,3)));
    }
}
