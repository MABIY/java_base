package 十三章;

import net.mindview.util.TextFile;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by lh on 17-8-14.
 * A very simple version of the "grep" program.
 * (Args: JGrep.java "\\b[Ssct]\\w+")
 */
public class JGrep {
    public static void main(String[] args) {
        args = new String[]{"JGrep.java", "\\b[Ssct]\\w+"};
        if (args.length < 2) {
            System.out.println("Usage: java JGrep file regex");
            System.exit(0);
        }
        Pattern p = Pattern.compile(args[1]);
        // Iterate through the lines of the input file:
        int index = 0;
        Matcher m = p.matcher("");
        for (String line : new TextFile(args[0])) {
            m.reset(line);
            while (m.find()) {
                System.out.println(index++ + ": " +m.group()+ ": " + m.start());
            }
        }
    }
}
