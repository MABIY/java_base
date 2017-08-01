package 十二章;

import static net.mindview.util.Print.print;

/**
 * Created by lh on 17-8-1.
 * Demonstrating the Exception Methods.
 */
public class ExceptionMethds {
    public static void main(String[] args) {
        try {
            throw new Exception("My Exception");
        } catch (Exception e) {
            print("Caught Exception");
            print("getmessage(): " + e.getMessage());
            print("getLocalizedMessage(): " +  e.getLocalizedMessage());
            print("toString()"  + e);
            print("printStackTrace():");
            e.printStackTrace(System.out);
        }
    }
}
