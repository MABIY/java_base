package 十三章;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static net.mindview.util.Print.print;

/**
 * Created by lh on 17-8-8.
 */
public class TestRegularExpression {
    public static void main(String[] args) {
        String[] a ={"abcabcabcdefabc", "abc+", "(abc)+", "(abc){2,}"};
        args = a;
        if (args.length < 2) {
            print("Usage:\njava TestReqularExpression " +
                    "characterSequence regularExpression+");
            System.exit(0);
        }
        print("Input: \"" + args[0] + "\"");
        for (String arg : args) {
            print("Regular expression: \"" + arg +"\"");
            Pattern p = Pattern.compile(arg);
            Matcher m = p.matcher(args[0]);
            while (m.find()) {
                print("Match \"" + m.group() + "\" at positions " +
                        m.start() + "_" + (m.end() - 1));
            }
        }
    } }
