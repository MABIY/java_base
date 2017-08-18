package 十三章;

import java.util.Locale;
import java.util.Scanner;

/**
 * Created by lh on 17-8-16.
 * Create a class that contains int, long,float and double
 * and String fields. Create a constructor for this class
 * that takes a single String argument,and scnas that
 * String into the various fields,Add a toString() method
 * and demonstrate that your class works correctly
 */
class DataHolder2 {
    private int i;
    private long l;
    private float f;
    private double d;
    private String s;

    private String t;
    DataHolder2(String data) {
        Scanner stdin = new Scanner(data);
        stdin.useLocale(Locale.US);
        i = stdin.nextInt();
        l = stdin.nextLong();
        f = stdin.nextFloat();
        d = stdin.nextDouble();
        s = stdin.next("\\w+");
        t = stdin.next("\\w+");
    }

    public String toString() {
        return i + " " + l + " " + f + " " + d + " " + s + " " + t;
    }
}

public class E20_Scanner {
    public static void main(String[] args) {
        DataHolder2 dh = new DataHolder2("1 1000000000000 1.1 1e55 Howdy Hi");
        System.out.println(dh.toString());
    }
}
