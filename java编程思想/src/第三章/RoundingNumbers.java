package 第三章;

import static net.mindview.util.Print.print;

/**
 * Created by lh on 17-6-17.
 */
public class RoundingNumbers {
    public static void main(String[] args) {
        double above = 0.7,below = 0.4;
        float fabove = 0.7f,fbelow = 0.4f;
        print("Math.rand(above) :" + Math.round(above) );
        print("Math.round(below) :" + Math.round(below));
        print("Math.rand(fabove):" + Math.round(fabove));
        print("Math.rand(fbelow) :" + Math.round(fbelow));
    }
}
