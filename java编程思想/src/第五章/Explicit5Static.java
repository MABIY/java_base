package 第五章;

import static net.mindview.util.Print.print;

/**
 * Created by lh on 17-6-22.
 */
class Cup {
    Cup(int marker) {
        print("Cup(" + marker + ")");
    }

    void f(int marker) {
        print("fc " + marker + ")");
    }
}

class Cups {
    static Cup cup1;
    static {
        cup1 = new Cup(1);
        cup2 = new Cup(2);
    }
    static Cup cup2;

    Cups() {
        print("Cupp)");
   }
}
public class Explicit5Static {
    public static void main(String[] args) {
       print("Inside main()");
        Cups.cup1.f(99);
    }
    static Cups cups1 = new Cups();
    static Cups cups2 = new Cups();
}
