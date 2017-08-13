package 十三章;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static net.mindview.util.Print.print;

/**
 * Created by lh on 17-8-8.
 */
public class Groups {
    public static final String POEM =
            "Twas brilling. and the slithy toves\n" +
                    "Did gyre and gimble in the wabe.\n" +
                    "All mimsy were the borogoves,\n" +
                    "Beware the jabberwock, my son.\n" +
                    "Thw jaws that bits, the claws that catch.\n" +
                    "Beware the jubjub bird, and shun\n" +
                    "The frumious Bandersnatch.";

    public static void main(String[] args) {
        Matcher m = Pattern.compile("(?m)(\\S+)\\s+((\\S+)\\s+(\\S+))$").matcher(POEM);
        while (m.find()) {
            for(int j =0; j <= m.groupCount();j++) {
                print("[" + m.group(j) + "]");
            }
            print();
        }
    }

}
