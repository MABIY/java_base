package 十三章;

import net.mindview.util.TextFile;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static net.mindview.util.Print.print;

/**
 * Created by lh on 17-8-14.
 * {Args: E15_JGrep2.java "\b[Ssct]\w+" CASE_INSENSITIVE}
 * Modify JGrep.java to accept flags as arguments (e.g.,)
 * Pattern.CASE_INSENSITIVE,PATTERN.MUTTLINE
 */
public class E15_JGrep2 {
    public static void main(String[] args) {
        args = new String[]{"E15_JGrep2.java", "\\b[Ssct]\\w+", "CASE_INSENSITIVE"};
        if (args.length < 3) {
            print("Usage: java E15_JGrep2 file regex pattern");
            print("pattern can take one of the following vlaues");
            print("CANON_EQ,CASE_INSENSITIVE,COMMENTS, " +
                    "DOTALL,MULTILINE,UNICODE_CASE,UNIX_LINES");
            System.out.println(0);
        }
        int flag = 0;
        if (args[2].equalsIgnoreCase("CANON_EQ")) {
            flag = Pattern.CANON_EQ;
        } else if (args[2].equalsIgnoreCase("CASE_INSENSITIVE")) {
            flag = Pattern.CASE_INSENSITIVE;
        } else if (args[2].equalsIgnoreCase("COMMENTS")) {
            flag = Pattern.COMMENTS;
        } else if (args[2].equalsIgnoreCase("DOTALL")) {
            flag = Pattern.DOTALL;
        } else if (args[2].equalsIgnoreCase("MULTILINE")) {
            flag = Pattern.MULTILINE;
        } else if (args[2].equalsIgnoreCase("UNICODE_CASE")) {
            flag = Pattern.UNICODE_CASE;
        } else if (args[2].equalsIgnoreCase("UNIX_LINES")) {
            flag = Pattern.UNIX_LINES;
        }
        Pattern p = Pattern.compile(args[1], flag
        );
        //Iterrate throught the lines of the input file:
        int index = 0;
        Matcher m = p.matcher("");
        for (String line : new TextFile(args[0])) {
            m.reset(line);
            while (m.find()) {
                print(index++ + ": " + m.group() + ": " + m.start());
            }
        }
    }
}
