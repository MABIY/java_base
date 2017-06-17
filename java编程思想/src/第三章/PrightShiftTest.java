package 第三章;

import static net.mindview.util.Print.print;

/**
 * Created by lh on 17-6-17.
 */
public class PrightShiftTest {
    public static void main(String[] args) {
        int h = 0x10000000;
        print(Integer.toBinaryString(h));
        for (int i = 0; i <29; i++) {
           h >>>= 1;
           print(Integer.toBinaryString(h));
        }

    }
}
