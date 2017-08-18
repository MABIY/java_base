package 十三章;

import java.util.Scanner;

/**
 * Created by lh on 17-8-16.
 */
public class SannerDelimiter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner("12, 42, 78, 88, 42");
        scanner.useDelimiter("\\s*,\\s*");
        while (scanner.hasNextInt()) {
            System.out.println(scanner.nextInt());
        }
        System.out.println(scanner.delimiter());
    }
}
