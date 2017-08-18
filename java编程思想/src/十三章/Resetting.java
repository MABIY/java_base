package 十三章;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by lh on 17-8-14.
 */
public class Resetting {
    public static void main(String[] args) {
        Matcher m = Pattern.compile("[frb][aiu][gx]").matcher("fix the rug with bags");
        while (m.find()) {
            System.out.println(m.group() + " ");
        }
        m.reset("fix the rig with rags");
        while (m.find()) {
            System.out.println(m.group() + " ");
        }
    }
}
