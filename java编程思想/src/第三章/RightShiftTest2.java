package 第三章;

import static net.mindview.util.Print.print;
import static sun.java2d.cmm.ColorTransform.In;

/**
 * Created by lh on 17-6-17.
 */
public class RightShiftTest2 {
    public static void main(String[] args) {
        int h = -1;
        print(Integer.toBinaryString(h));
        h <<= 10;
        print(Integer.toBinaryString(h));
        for (int i = 0; i < 32; i++) {
            h >>>= 1;
            print(Integer.toBinaryString(h));

        }
    }
}
