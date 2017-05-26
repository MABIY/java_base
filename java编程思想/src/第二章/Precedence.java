package 第二章;

import static net.mindview.util.Print.print;

/**
 * Created by lh on 17-5-26.
 */
public class Precedence {
    public static void main(String[] args) {
        int x = 1,y =2,z =3;
        int a = x +y-2/2 +z;
        int b = x + (y - 2) / (2 + z);
        print("a.= " + a + " b = " + b);
    }
}
