package 十二章;

/**
 * Created by lh on 17-7-31.
 * Define an object reference and initialize it
 * to null. Try to call a method through this
 * referenece . Now wrap the code in a try-catch
 * clause to catch the exception
 */
public class E02_NullReference {
    public static void main(String[] args) {
        String s = null;
        // Causes a NullPointerException
        //! s.toString():
//        s.toString();
        try {
            s.toString();
        } catch (NullPointerException e) {
            System.out.println("Caught Exception " + e);
        }
    }
}
