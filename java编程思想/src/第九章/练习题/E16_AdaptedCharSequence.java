package 第九章.练习题;

import java.io.IOException;
import java.nio.CharBuffer;
import java.util.Random;
import java.util.Scanner;

/**
 * Created by lh on 17-7-3.
 * Create a class that produces a sequence of chars.
 * Adapt this class so that it can be an input to a
 * Scanner object
 */
class CharSequence {
    private static Random rand = new Random(47);
    private static final char[] capitals = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
    private static final char[] lowers = "abcdefghijklmnopqrstuvwxyz".toCharArray();
    private static final char[] vowerls = "aeiou".toCharArray();

    char[] generate() {
        char[] buffer = new char[10];
        int idx = 0;
        buffer[idx++] =capitals[rand.nextInt(capitals.length)];
        for (int i = 0; i < 4; i++) {
            buffer[idx++] = vowerls[rand.nextInt(vowerls.length)];
            buffer[idx++] = lowers[rand.nextInt(lowers.length)];
        }
        buffer[idx] = ' ';
        return buffer;
    }
}
public class E16_AdaptedCharSequence extends CharSequence implements Readable{
    private int count;

    public E16_AdaptedCharSequence(int count) {
        this.count = count;
    }

    @Override
    public int read(CharBuffer cb) throws IOException {
        if (count-- == 0) {
            return -1; // indicates end of input
        }
        char[] buffer = generate();
        cb.put(buffer);
        return buffer.length;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(new E16_AdaptedCharSequence(10));
        while (s.hasNext()) {
            System.out.println(s.next());
        }
    }
}
