package 十三章;

import static net.mindview.util.Print.print;

/**
 * Created by lh on 17-8-7.
 */
public class Replacing {
    static String s = Splitting.knights;

    public static void main(String[] args) {
        print(s.replaceFirst("f\\w+", "located"));
        print(s.replaceAll("shrubbery|tree|herring", "banana"));
    }
}
