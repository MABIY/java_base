package 第三章;

import org.omg.PortableInterceptor.INACTIVE;

import static net.mindview.util.Print.print;
import static sun.misc.Version.println;

/**
 * Created by lh on 17-6-16.
 */
public class BinaryTest {
    public static void main(String[] args) {
        int i = 1 + 4 + 16 + 64;
        int j = 2 + 8 + 32 + 128;
        print("i = " + Integer.toBinaryString(i));
        print("j = " + Integer.toBinaryString(j));
        print(" i & j = " + Integer.toBinaryString(i & j));
        print("i | j = " + Integer.toBinaryString(i | j));
        print("i ^ j = " + Integer.toBinaryString(i ^ j));
        print("~i = " + Integer.toBinaryString(~i));
        print("~j = " + Integer.toBinaryString(~j));
    }

}
