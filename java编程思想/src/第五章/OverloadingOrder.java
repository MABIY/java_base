package 第五章;

import static net.mindview.util.Print.print;

/**
 * Created by lh on 17-6-20.
 */
public class OverloadingOrder {
    public static void main(String[] args) {
        f("String first", 11);
        f(99, "Int first");
    }

    private static void f(String s, int i) {
        print("String: " + s + ". int:" + i);
    }

    private static void f(int i, String s) {
        print("int: " + i + ". String: " + s);
    }
}
