package 十二章;

/**
 * Created by lh on 17-8-2.
 * The finally clause is always executed
 */
class ThreeException extends Exception {

}
public class FinallyWorks {
    static int count = 0;

    public static void main(String[] args) throws Exception {
        while (true) {
            try {
                // Post-increment is zero first time:
                if (count++ == 0) {
                    throw new Exception();
                }
                System.out.println("No exception");
            } catch (ThreeException e) {
                System.out.println("ThreeException");
            }finally {
                System.out.println("In finally clause");
                if (count == 2) {
                    System.out.println("break");
                    break;
                }
            }
        }

    }
}
