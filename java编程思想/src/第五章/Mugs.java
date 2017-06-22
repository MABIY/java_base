package 第五章;

import static net.mindview.util.Print.print;

/**
 * Created by lh on 17-6-22.
 */
class Mug {
    Mug(int marker) {
        print("Mug(" + marker + "_");
    }

    void f(int marker) {
        print("fc" + marker + ")");
    }
}
public class Mugs {
    Mug mug1;
    Mug mug2;
    {
        mug1 = new Mug(1);
        mug2 = new Mug(2);
    }

    Mugs() {
        print("Mugs()");
    }

    Mugs(int i) {
        print("Mugs(int)");
    }

    public static void main(String[] args) {
        print("Inside main()");
        new Mugs();
        print("new Mugs() completed");
        new Mugs(1);
        print("new Mugs(1) completed");
    }
}
