package 第三章;

import java.util.Date;
import java.util.Locale;

import static net.mindview.util.Print.print;

/**
 * Created by lh on 17-6-14.
 */
public class HelloDate {
    public static void main(String[] args) {
        print("Hello, it's");
        print(new Date());
        int i = 461012;
        System.out.printf("The value of i is : %d%n" , i);
        System.out.println("HelloDate.main");
    }
}
