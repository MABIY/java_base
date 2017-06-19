package 第四章.练习题答案;

import static net.mindview.util.Print.print;

/**
 * Created by lh on 17-6-19.
 */
public class BitTest {
    public static void main(String[] args) {
        int i = 1 + 4 + 16 + 64;
        int j = 2 + 8 + 32 + 128;
        int k = 0x100;
        int m = 0;
        print("Using Integer.toBinaryString():");
        print("i = " + Integer.toBinaryString(i));
        print("j = " + Integer.toBinaryString(j));
        print("k = " + Integer.toBinaryString(k));
        print("m = " + Integer.toBinaryString(m));
        print("i & j = " + (i & j) + " = " + Integer.toBinaryString(i & j));
        print("i | j = " + (i | j) + " = " + Integer.toBinaryString(i | j));
        print("i ^ j = " + (i ^ j) + " = " + Integer.toBinaryString(i ^ j));
        print("Using binaryPrint()");
        print("i = " + i + " =");
        binaryPrint(i);
        print("j = " + j + "=");
        binaryPrint(j);
        print("k = " + k + " =");
        binaryPrint(k);
        print("m = " + m + " = ");
        binaryPrint(m);
        print("i & j = " +(i & j) + " = " );
        binaryPrint(i&j);
        print("i | y =" +(i | j) + " = ");
        binaryPrint(i | j);
        print("i ^ j = " + (i ^ j) + " =");
        binaryPrint(i ^ j);
        print("~i = " + ~i + " = ");
        binaryPrint(~i);
        print("~j = " + ~j + "= ");
        print("~j = " + ~j+ " = ");
        binaryPrint(~j);




























    }

    private static void binaryPrint(int i) {

        if (i == 0) {
            System.out.println(0);
        } else {
            int nlz = Integer.numberOfLeadingZeros(i);
            i <<= nlz;
            for (int p = 0; p < 32 - nlz; p++) {
                int n = (Integer.numberOfLeadingZeros(i) == 0) ? 1 : 0;
                System.out.print(n);
                i <<= 1;
            }
        }
        System.out.println("");








































    }
}
