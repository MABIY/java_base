package 十三章;

import java.util.regex.Pattern;

/**
 * Created by lh on 17-8-8.
 */
public class Rudolph {
    public static void main(String[] args) {
        boolean b = Pattern.matches("a*b", "aaaaab");
        System.out.println(String.format("b: %b", b));

        for (String parttern : new String[]{"Rudolph", "[rR]udolph", "[rR][aeiou][a-z]ol.*","R.*"}) {
            System.out.println("Rudolph".matches(parttern));
        }
    }
}
