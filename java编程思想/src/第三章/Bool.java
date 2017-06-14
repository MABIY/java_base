package 第三章;

import net.mindview.util.Print;

import java.util.Random;
import static net.mindview.util.Print.*;
/**
 * Created by lh on 17-6-13.
 */
//: operators/Bool.java
// Relational and logical operators
public class Bool {
    public static void main(String[] args) {
        Random rand = new Random(100);
        int i = rand.nextInt(100);
        int j = rand.nextInt(100);
        print("i = " + i);
        print("j = "  + j);
        print("i > j is " + (i > j));
        print("i < j is " + (i < j));
        print("i >= j is" + (i >= j));
        print("i <= j is" + (i<=j) );
        print(" i == j" + (i == j));
        print("i !=j " + (i !=j ));

        //Treating an int as boolean is not legal Java:
//        print(" i && j" + (i && j));
//        print("i || j is " + (i || j));
//        print(" !i is " + !i);
        print("(i < 10) && (j < 10) is " + ((i < 10) && (j < 10)));
        print("(i < 10) || (j <10) is " + ((i < 10) || (j  <10 )));
    }
}

