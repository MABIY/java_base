package 十二章;

import 知识点.stand_Input_output.Echo;

import static net.mindview.util.Print.print;

/**
 * Created by lh on 17-8-2.
 * Finally is always executed
 */
class FourException extends Exception {

}
public class AlwaysFinally {
    public static void main(String[] args) {
        print("Entering first try block");
        try {
            print("Entering second try block");
            try {
                throw new FourException();
            } finally {
                print("finally in 2nd try block");
            }
        } catch (FourException e) {
            System.out.println("Caught fourException in lst try block");

        } finally {
            System.out.println("finally in lst try block");
        }
    }
}
