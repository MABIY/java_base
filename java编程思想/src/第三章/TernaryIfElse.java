package 第三章;

import static net.mindview.util.Print.print;

/**
 * Created by lh on 17-6-17.
 */
public class TernaryIfElse {
    public static void main(String[] args) {
        print(ternary(9));
        print(ternary(10));
        print(standardIfElse(9));
        print(standardIfElse(10));
    }

    private static int standardIfElse(int i) {
        if (i < 10) {
            return i * 100;
        } else {
            return i * 10;
        }
    }

    private static int ternary(int i) {
        return i < 10 ? i * 100 : i * 10;
    }
}
