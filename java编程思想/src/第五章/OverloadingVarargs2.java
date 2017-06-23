package 第五章;

/**
 * Created by lh on 17-6-22.
 */
public class OverloadingVarargs2 {
    static void f(float i, Character... args) {
        System.out.println("firest");
    }

    static void f(char c,Character... args) {
        System.out.println("second");
    }

    public static void main(String[] args) {
        f(1F,'a');
        f('a', 'b');
    }
}
