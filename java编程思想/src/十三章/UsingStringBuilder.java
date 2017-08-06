package 十三章;

import java.util.Random;

/**
 * Created by lh on 17-8-5.
 */
public class UsingStringBuilder {
    public static Random rand = new Random();

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < 25; i++) {
            result.append(rand.nextInt(100));
            result.append(", ");
        }
        result.delete(result.length() - 2, result.length());
        result.append("]");
        return result.toString();
    }

    public static void main(String[] args) {
       UsingStringBuilder usb = new UsingStringBuilder();
        System.out.println(usb);
    }
}
