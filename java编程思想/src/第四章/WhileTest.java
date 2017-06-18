package 第四章;

/**
 * Created by lh on 17-6-18.
 */
public class WhileTest {
    public static void main(String[] args) {
        while (condition()) {
            System.out.println("Inside 'while'");
        }
        System.out.println("Exited 'while'");

    }

    private static boolean condition() {
        boolean result = Math.random() < 0.99;
        System.out.println(result + ", ");
        return result;
    }
}
