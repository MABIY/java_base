package 第四章.练习题答案;

/**
 * Created by lh on 17-6-19.
 */
public class VampireNumbers {
    public static void main(String[] args) {
        for (int i = 1000; i < 10000; i++) {
            productTest(i,com(a(i),b(i)),com(c(i),d(i)));
            productTest(i,com(a(i),b(i)),com(c(i),d(i)));
            productTest(i,com(b(i),a(i)),com(d(i),c(i)));
            productTest(i,com(b(i),a(i)),com(d(i),c(i)));
            productTest(i,com(a(i),c(i)),com(d(i),b(i)));
            productTest(i,com(a(i),c(i)),com(d(i),b(i)));
            productTest(i,com(c(i),a(i)),com(b(i),d(i)));
            productTest(i,com(c(i),a(i)),com(b(i),d(i)));
            productTest(i,com(a(i),d(i)),com(c(i),b(i)));
            productTest(i,com(a(i),d(i)),com(c(i),b(i)));
            productTest(i,com(d(i),a(i)),com(b(i),c(i)));
            productTest(i,com(d(i),a(i)),com(b(i),c(i)));
        }
    }

    private static void productTest(int i, int com, int com1) {
        if (i == com * com1) {
            System.out.println(i + " = " + com + " * " +com1);
        }
    }

    private static int com(int i, int b) {
        return i * 10 + b;
    }

    private static int d(int i) {
        return i % 1000 % 100 % 10;
    }

    private static int c(int i) {
        return i%1000%100/10;
    }

    private static int b(int i) {
        return i%1000/100;
    }

    private static int a(int i) {
        return i /1000;
    }
}
