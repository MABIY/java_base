package 第三章;

/**
 * Created by lh on 17-6-16.
 */
public class Exponents {
    public static void main(String[] args) {
        // Uppercase and lowercase 'e' are the same:
        float expfloat = 1.39e-43f;
        System.out.println((double) expfloat);
        double expDouble = 47e47d; //'d' is optional
        double expDouble2 = 47e47; // Automatically double
        System.out.println(expDouble);
    }
}
