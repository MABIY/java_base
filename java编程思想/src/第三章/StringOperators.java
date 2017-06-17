package 第三章;

import static net.mindview.util.Print.print;

/**
 * Created by lh on 17-6-17.
 */
public class StringOperators {
    public static void main(String[] args) {
        int x =0 , y = 1 ,z = 2;
        String s = "x ,y , z";
        print(s + x + y + z);
        print(x + " " + s); //Converts x to a String
        s +="(summed) ="; // Concatenation operator
        print(s +(x + y + z));
        print("" + x); // shorthand for Integer ,toString()
    }
}
