package 第一章.练习题答案;

/**
 * Created by lh on 17-5-24.
 */
public class Practice_4 {
    public static void main(String[] args) {
        class DateOnly {
            int i;
            double d;
            boolean b;

            void show() {
                System.out.println(i);
                System.out.println(d);
                System.out.println(b);
            }
        }
        DateOnly data = new DateOnly();
        data.i = 3;
        data.d = 2.71828;
        data. b = false;
        data.show();
    }
}
