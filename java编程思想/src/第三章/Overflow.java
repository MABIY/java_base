package 第三章;

/**
 * Created by lh on 17-6-17.
 */
public class Overflow {
    public static void main(String[] args) {
        int big = Integer.MAX_VALUE;
        System.out.println("big =" + big);
        System.out.println(Integer.toBinaryString(big));
        int bigger = big * 4;
        System.out.println("bigger = " + bigger);
    }
}
