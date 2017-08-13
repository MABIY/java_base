package 十三章;

/**
 * Created by lh on 17-8-7.
 * Using the documentation for java.util.regex.Pattern
 * as a resource., replace all the vowels in
 * Splitting.knights with underscore.
 */
public class E09_Replacing2 {
    public static void main(String[] args) {
        System.out.println(
                Splitting.knights.replaceAll("(?i)[aeiou]","_")
        );
    }
}
