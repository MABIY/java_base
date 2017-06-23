package 第五章.练习题答案;

/**
 * Created by lh on 17-6-23.
 */
public class VarargEx20 {
    public static void main(String... args) {
        for (String s : args) {
            System.out.println(s + "");
        }
        System.out.println();
    }
}
