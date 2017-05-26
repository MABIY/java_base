package 第三章;

import java.util.Random;

import static net.mindview.util.Print.print;

/**
 * Created by lh on 17-5-26.
 */
public class MathOps {
    public static void main(String[] args) {
        // create a seeded random number generator
        Random random = new Random(47);
        int i, k, j;
        //Choose value form 1 to 100
        j = random.nextInt(100) + 1;
        k = random.nextInt(100) + 1;
        print("k : " + k);
        i = j + k;
        System.out.println("j + k" + i);
        i = j - k;
        print("j - k: " + i);
        i = k / j;
        print("k / j: " + i);
        i = k* j;
        print("k * j : " + i );
        i = k % j;
        print("k % j" + i);
        j %= k;
        print("j % = k: " + j);
        // Floating-point  number tests
        float u,v,w; // Applies to dounbles,too
        v = random.nextFloat();
        print("v : " + v);
        w = random.nextFloat();
        print("w: " + w);
        u = v + w;
        print("v + w : " + u);
        u = v - w;
        print("v -w: " + u );
        u = v * w;
        print("v * w" + u);
        u = v / w;
        print("v / w: " + u );
        // The following also works for char
        // byte,short,int ,long  ,and doube
        u +=v;
        print("u +=v: " + u);
        u -= v;
        print("u -=v: " +u);
        u *= v;
        print("u *= v: " + u);
        u /= v;
        print("u /= v : " + u);









    }
}
