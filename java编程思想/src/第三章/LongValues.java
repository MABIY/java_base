package 第三章;

import static net.mindview.util.Print.print;

/**
 * Created by lh on 17-6-16.
 */
public class LongValues {
    public static void main(String[] args) {
        long n1 = 0xffff;
        long n2 = 07777;
        print("long n1 in hex = " + Long.toBinaryString(n1));
        print("long n2 in oct = " + Long.toBinaryString(n2));
    }
}
