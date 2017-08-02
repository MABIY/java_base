package 十二章;

/**
 * Created by lh on 17-8-2.
 * Repair the problem in Lostmessage.java by
 * guarding the call in the finally cluause
 */
public class E19_GuardedLostMessage {
    void f() throws VeryImportantExcetpion {
        throw new VeryImportantExcetpion();
    }

    void dispose() throws HoHumException {
        throw new HoHumException();
    }

    public static void main(String[] args) {
        try {
            LostMessage lm = new LostMessage();
            try {
                lm.f();
            } finally {
                try {
                    lm.dispose();
                } catch (HoHumException e) {
                    System.out.println(e);
                }
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
