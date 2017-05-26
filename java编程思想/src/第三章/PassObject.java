package 第三章;

import static net.mindview.util.Print.print;

/**
 * Created by lh on 17-5-26.
 */
class Letter {
    char c;
}
public class PassObject {
    static void f(Letter y) {
        y.c = 'z';
    }

    public static void main(String[] args) {
        Letter x = new Letter();
        x.c = 'a';
        print("1: x.c:" + x.c);
        f(x);
        print("2: x.c:" + x.c);
    }
}
