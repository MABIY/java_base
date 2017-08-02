package 十二章;

/**
 * Created by lh on 17-8-2.
 * How an exception can be lost.
 */
class VeryImportantExcetpion extends Exception {
    @Override
    public String toString() {
        return "A very important exception!";
    }
}

class HoHumException extends Exception {
    @Override
    public String toString() {
        return "HoHumException{}";
    }
}
public class LostMessage {
    void f() throws VeryImportantExcetpion {
        throw new VeryImportantExcetpion();
    }
    void dispose() throws HoHumException {
        throw new HoHumException();
    }

    public static void main(String[] args) {
        try {
            LostMessage ln = new LostMessage();
            try {
                ln.f();
            } finally {
                ln.dispose();
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
