package 十二章;

/**
 * Created by lh on 17-8-2.
 * Add a second level of exception loss to
 * LostMessage.java so that the hoHumException is
 * itself replaced by third exception
 */
class YetAnotherException extends Exception {
    @Override
    public String toString() {
        return "Yet anotehr exception";
    }
}

class LostMessage2 {
    void f() throws VeryImportantExcetpion {
        throw new VeryImportantExcetpion();
    }

    void dispose() throws HoHumException {
        throw new HoHumException();
    }

    void cleanup() throws YetAnotherException {
        throw new YetAnotherException();
    }
}

public class E18_LostMessage {
    public static void main(String[] args) {
        try {
            LostMessage2 lm = new LostMessage2();
            try {
                try {
                    lm.f();
                } finally {
                    lm.dispose();
                }
            } finally {
                lm.cleanup();
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
