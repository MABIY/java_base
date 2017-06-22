package 第五章;

/**
 * Created by lh on 17-6-22.
 */
public class AutoboxingVarargs {
    public static void f(Integer... args) {
        for (Integer i : args) {
            System.out.println(i + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        f(new Integer(1),new Integer(2));
        f(4, 5, 6, 67, 8);
        f(10, new Integer(11), 12);
    }
}
