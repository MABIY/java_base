package 第五章;

/**
 * Created by lh on 17-6-22.
 */
public class VarargType {
    static void f(Character... args) {
        System.out.println(args.getClass());
        System.out.println(" length " + args.length);
    }
    public static void main(String[] args) {
        f('a');
        f();
        g(1);
        g();
        System.out.println("int[]: " + new int[0].getClass());

    }

    private static void g(int... args) {
        System.out.println(args.getClass());
        System.out.println("  length" + args.length);
    }
}
