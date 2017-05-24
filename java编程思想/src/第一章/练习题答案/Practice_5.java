package 第一章.练习题答案;

/**
 * Created by lh on 17-5-24.
 */
public class Practice_5 {
    public static void main(String[] args) {
        class DataOnly {
            int i;
            double d;
            boolean b;
            void show() {
                System.out.println(i);
                System.out.println(d);
                System.out.println(b);
            }
        }
        DataOnly data = new DataOnly();
        data.i = 234;
        data.d = 2.1234545;
        data.b = true;
        data.show();
    }
}
