package 第五章;

import static net.mindview.util.Print.print;

/**
 * Created by lh on 17-6-22.
 */
class Go {
    static {
        s2 = "drive car";
        s3 = "fly plane";
        print("s2 & s3 initialized");
    }
    static String s2 ,s3;
    static String s1 = "run";

    static void how() {
        print(s1 + "or " + s2 + "or" + s3);
    }

    Go() {
        print("Go()");
    }
}
public class ExplicitStaticEx {
    public static void main(String[] args) {
        print("Inside main()");
        Go.how();
        print("Go.sq: " +  Go.s1);
    }
    static Go g1 = new Go();
    static Go g2 = new Go();
}
