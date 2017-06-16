package 第三章;

import static net.mindview.util.Print.print;

/**
 * Created by lh on 17-6-16.
 */
public class Literals {
    public static void main(String[] args) {
        int i1 = 0x2f; // Hexadecimal (lowercase);
        print("i1: " + Integer.toBinaryString(i1));
        int i2 = 0x2F; //Hexadercimal (uppercase)
        print("i2: " + Integer.toBinaryString(i2));
        int i3 = 0177; // Octal (leading zero)
        print("i3: " + Integer.toBinaryString(i3));
        char c = 0xffff; //max char hex value
        print("c: " + Integer.toBinaryString(c));
        byte b = 0x7f;
        print("b: " + Integer.toBinaryString(b));
        short s = 0x7fff;
        print("s: " + Integer.toBinaryString(s));
        long n1 = 200L; // long suffix
        long n2 = 200l;
        float f1 = 1;
        float f2 = 1F; //float suffix
        float f3 = 1f; // float suffix
        double d1 = 1d; //double suffix
        double d2 = 1D; // double suffix
        //(Hex and Octal also work with long)
    }
}
