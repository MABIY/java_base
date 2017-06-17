package 第三章;

import static net.mindview.util.Print.print;

/**
 * Created by lh on 17-6-17.
 */
public class URShift {
    public static void main(String[] args) {
        int i = 1;
        print(Integer.toBinaryString(1));
        i >>>=10;
        print(Integer.toBinaryString(i));
        long l = -1;
        print(Long.toBinaryString(l));
        l >>>=10;
        print(Long.toBinaryString(l));
        short s =  -1;
        print(Integer.toBinaryString(s));
        s >>>=17;
        print(Integer.toBinaryString(s));
        byte b = -1;
        print(Integer.toBinaryString(b));
        b >>>=10;
        print(Integer.toBinaryString(b));
        b = -1;
        print(Integer.toBinaryString(b));
        print(Integer.toBinaryString(b>>>10));
    }
}
