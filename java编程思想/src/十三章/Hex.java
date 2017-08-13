package 十三章;

import net.mindview.util.BinaryFile;

import java.io.File;

/**
 * Created by lh on 17-8-7.
 */
public class Hex {
    public static String foramt(byte[] data) {
        StringBuilder result = new StringBuilder();
        int n = 0;
        for (byte b : data) {
            if (n % 16 == 0) {
                result.append(String.format("%05x: ", n));
            }
            result.append(String.format("%02x ", b));
            n++;
            if (n % 16 == 0) {
                result.append("\n");
            }
        }
        result.append("\n");
        return result.toString();
    }

    public static void main(String[] args) throws Exception {
        if (args.length == 0) {
            //Thet by displaying this class file:
            System.out.println(foramt(BinaryFile.read("Hex.class")));
        } else {
            System.out.println(foramt(BinaryFile.read(new File(args[0]))));
        }
    }
}
