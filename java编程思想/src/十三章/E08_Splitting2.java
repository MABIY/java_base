package 十三章;

import java.util.Arrays;

/**
 * Created by lh on 17-8-7.
 * Split the string Splitting.knights on the words
 * "the" or "you."
 */
public class E08_Splitting2 {
    public static void split(String regex) {
        System.out.println(
                Arrays.toString(Splitting.knights.split(regex))
        );
    }
    public static void main(String[] args) {
        split("the|you");
    }
}
