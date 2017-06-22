package 第五章.练习题答案;

/**
 * Created by lh on 17-6-22.
 */
public class VarargEx19 {
    static void showStrings(String... args) {
        for (String s : args) {
            System.out.print(s + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        showStrings("one","Two","three","four");
        showStrings(new String[]{"1,","2","3","4"});
    }
}
