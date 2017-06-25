package 第七章;

import java.util.Random;

import static net.mindview.util.Print.print;

/**
 * Created by lh on 17-6-25.
 */
class Value {
    int i; //Package access

    public Value(int i) {
        this.i = i;
    }
}

public class FinalData {
    //Typical public constant:
    public static final int VALUE_THREE = 39;
    private static final int VALUE_TWO = 99;
    private static final Value VAL_3 = new Value(33);
    private static Random rand = new Random(47);
    static final int INT_5 = rand.nextInt(20);
    // Can be compile-time constants
    private final int valueOne = 9;
    //Cannot be compile-time constants
    private final int i4 = rand.nextInt(20);
    private final Value v2 = new Value(22);
    // Arrays
    private final int[] a = {1, 2, 3, 4, 5, 6};
    private String id;
    private Value v1 = new Value(11);

    public FinalData(String id) {
        this.id = id;
    }

    public static void main(String[] args) {
        FinalData fd1 = new FinalData("fd1");
        //fd1.valueOne++;
        fd1.v2.i++;
        fd1.v1 = new Value(9); //Ok -- not final
        for (int i = 0; i < fd1.a.length; i++) {
           fd1.a[i]++;  //Object isn't constant!
        }
//        fd1.v2 = new Value(0);
        print(fd1);
        print("Creating new FinalData");
        FinalData fd2 = new FinalData("fd2");
        print(fd1);
        print(fd2);
    }

    @Override
    public String toString() {
        return id + ": " + "i4 = " + i4 + ", INT_5 = " + INT_5;
    }
}
