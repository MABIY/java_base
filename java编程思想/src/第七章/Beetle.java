package 第七章;

import static net.mindview.util.Print.*;

/**
 * Created by lh on 17-6-25.
 */
class Insect {
    int b = s();

    private int s() {
        System.out.println("2222");
        return 1;
    }

    private int i = 9;
    protected int j ;

    public Insect() {
        print("i= " + j + ", j = " + j);
        j = 39;
    }
    private static int x1 = printInit("static Insect.x1 initialized");

    static int printInit(String s) {
        print(s);
        return 47;
    }
}
public class Beetle extends Insect{
    private int b = f();
    private int k = printInit("Bettle.k initialized");

    private int f() {
        System.out.println("2222");
        return 1;
    }

    public Beetle() {
        print("k = " + k);
        print("j = " + j);
    }
    private static int x2 = printInit("static Beetle.x2 initialized");

    public static void main(String[] args) {
        print("Beetle constructor");
        Beetle b = new Beetle();
    }
}
