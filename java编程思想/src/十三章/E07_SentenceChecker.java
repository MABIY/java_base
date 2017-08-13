package 十三章;

/**
 * Created by lh on 17-8-7.
 * Using the documentation for java.util.regex.Pattern
 * as a resource,write and test a rugular expression
 * that checks a sentence to see that is begins with a
 * capital letter and ends with a period
 */
public class E07_SentenceChecker {
    public static boolean mathes(String text) {
        return text.matches("\\p{javaUpperCase}.*\\.");
    }

    public static void main(String[] args) {
        System.out.println(mathes("This is correct."));
        System.out.println(mathes("bad sentence 1."));
        System.out.println(mathes("Bad sentene 2"));
        System.out.println(mathes("This is also correct..."));
    }
}
