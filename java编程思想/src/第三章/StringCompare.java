package 第三章;

import static net.mindview.util.Print.print;

/**
 * Created by lh on 17-6-17.
 */
public class StringCompare {
    public static void main(String[] args) {
        String s = "one", t = "two";
        stringTest(s, t);
    }

    static void f(boolean b) {
        if (b == true) {
            print(true);
        }
    }
    private static void stringTest(String s, String t) {
        f(s == t);
        f(s.equals(t));
        f(t.equals(s));
        f(s != t);
//        f(!s);
//        f(!t);
//        s = s && t;
//        s = s || t;
//        s = ~t;
//        s = s & t;
//        s = s | t;
//        s = s ^ t;
//        s &= t;
//        s ^= t;
//        s |= t;
    }

}
