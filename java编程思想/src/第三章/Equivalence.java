package 第三章;

/**
 * Created by lh on 17-5-26.
 */
public class Equivalence {
    public static void main(String[] args) {
        Integer n1 = new Integer(47);
        Integer n2 = new Integer(47);
        System.out.println(47 == n1);
        System.out.println(n1 == n2);
        System.out.println(n1 != n2);
    }
}
