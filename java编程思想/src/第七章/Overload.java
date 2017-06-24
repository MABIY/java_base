package 第七章;


import static net.mindview.util.Print.print;

/**
 * Created by lh on 17-6-24.
 */
class ThreeWay {
    void number(byte b) {
        print(b);
    }

    void number(short s) {
        print(s);
    }

    void number(int i) {
        print(i);
    }
}

public class Overload extends ThreeWay{
    void number(float f) {
        print(f);
    }

    public static void main(String[] args) {
        Overload ov = new Overload();
        ov.number((byte)0);
        ov.number((short)1);
        ov.number(2);
        ov.number(2.0f);
    }
}
