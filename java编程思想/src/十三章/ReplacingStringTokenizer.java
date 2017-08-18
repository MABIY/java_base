package 十三章;

import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 * Created by lh on 17-8-18.
 */
public class ReplacingStringTokenizer {
    public static void main(String[] args) {
        String input = "But,I'm,not,dead,yes!,I,feel,happy!";
        StringTokenizer stoke = new StringTokenizer(input);
        while (stoke.hasMoreElements()) {
            System.out.print(stoke.nextToken() + " ");
        }
        System.out.println();
        System.out.println(Arrays.toString(input.split(" ")));
        Scanner scanner = new Scanner(input);
        scanner.useDelimiter(",");
        while (scanner.hasNext()) {
            System.out.print(scanner.next() + " ");
        }
    }
}
