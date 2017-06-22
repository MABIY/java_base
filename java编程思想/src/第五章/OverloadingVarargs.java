package 第五章;

/**
 * Created by lh on 17-6-22.
 */
public class OverloadingVarargs {
    static void f(Character... args) {
        System.out.println("first");
        for (Character c : args) {
            System.out.println(" " + c);
        }
    }

    static void f(Integer... args) {
        System.out.println("second");
        for (Integer i : args) {
            System.out.println(" " + i);
        }
        System.out.println();
    }

    static void f(Long... args) {
        System.out.println("third");
    }

    public static void main(String[] args) {
        f('a', 'b', 'c');
        f(1);
        f(2,1);
        f(0);
        f(0L);
//        f(); // Wono't compile --- ambiguous
    }
}
