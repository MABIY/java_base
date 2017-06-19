package 第四章;

/**
 * Created by lh on 17-6-19.
 */
public class CommaOperator {
    public static void main(String[] args) {
        for (int i = 0, j = i + 10; i < 5; i++, j = i * 2) {
            System.out.println("i = " + i +" j = " + j);
        }
    }
}
