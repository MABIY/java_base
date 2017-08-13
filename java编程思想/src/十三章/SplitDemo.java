package 十三章;

import java.util.Arrays;
import java.util.regex.Pattern;

import static net.mindview.util.Print.print;

/**
 * Created by lh on 17-8-10.
 */
public class SplitDemo {
    public static void main(String[] args) {
        String input = "This!!unusual use!!of exclamation!!points";
        print(Arrays.toString(Pattern.compile("!!").split(input)));
        // Only do the firet three;
        System.out.println(Arrays.toString(Pattern.compile("!!").split(input,3)));

//        print(Arrays.toString(Pattern.compile("!!").split(input, 3)));
    }
}
