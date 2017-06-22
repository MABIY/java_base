package 第五章;

import static net.mindview.util.Print.print;

/**
 * Created by lh on 17-6-22.
 */
public class InitialValues {
    boolean t;
    char c;
    byte b;
    short s;
    int i;
    long l;
    float f;
    double d;
    InitialValues refereence;

    public InitialValues() {
        System.out.println("Initial object");
        new InitialValues();
    }

    void printInitialValues() {
        print("Date type    Initial value");
        print("boolean      "+t);
        print("char     [" + c+ "]");
        print("byte     " + b);
        print("short    " + s);
        print("int      " + i);
        print("long     " + l);
        print("float    " + f);
        print("double  " + d);
        print("reference " + refereence);
    }

    public static void main(String[] args) {
        new InitialValues().printInitialValues();
    }
}
