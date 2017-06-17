package 第三章;

import static net.mindview.util.Print.print;

/**
 * Created by lh on 17-6-17.
 */
public class CharBinaryTest {
    public static void main(String[] args) {
        char c ='a';
        printC(c);
        c = 'b';
        printC(c);

        c = 'c';
        printC(c);
        c = 'd';
        printC(c);
        c +=1;
        printC(c);
        c = 'A';
        printC(c);

        for (int i = 0; i <26 ; i++) {
           c +=1;
           print(Integer.toBinaryString(c));
        }
    }

    public static final void printC(char a) {
        print(Integer.toBinaryString(a));
    }
}
