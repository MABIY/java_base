package 第七章.练习题;

/**
 * Created by lh on 17-6-25.
 */
class Poppet {
    private int i;

    Poppet(int k) {
        i = k;
    }

    @Override
    public String toString() {
        return ("Popet " + i);
    }
}
public class BlankFinalEx {
    private final Poppet p ; // Blank final reference

    public BlankFinalEx(int x) {
        p = new Poppet(x);
    }

        public BlankFinalEx() {
        p = new Poppet(1);  // Initialize blank final refereence
    }

    public static void main(String[] args) {
        BlankFinalEx b1 = new BlankFinalEx();
        BlankFinalEx b2 = new BlankFinalEx(47);
        System.out.println("b1.p: " + b1.p);
        System.out.println("b2.p: " + b2.p);
    }
}
