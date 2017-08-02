package 十二章;

import java.io.FileNotFoundException;
import java.io.IOException;

import static net.mindview.util.Print.print;

/**
 * Created by lh on 17-8-2.
 * "Turning off" checked exceptions
 */
class WrapCheckedException {
    void throwruntimExceptions(int type) {
        try {
            switch (type) {
                case 0:
                    throw new FileNotFoundException();
                case 1:
                    throw new IOException();
                case 2:
                    throw new RuntimeException("Where am I?");
            }
        } catch (Exception e) { //Adapt to unchecked
            throw new RuntimeException(e);
        }
    }
}

class SomeOtherException extends Exception {
}
public class TurnOffChecking {
    public static void main(String[] args) {
        WrapCheckedException wce = new WrapCheckedException();
        // you can call throwRuntimeExcepiton() with a try
        // block, and let RuntimeExceptions leave the method.
        for (int i = 0; i < 4; i++) {
            try {
                if (i < 3) {
                    wce.throwruntimExceptions(i);
                } else {
                    throw new SomeOtherException();
                }
            } catch (SomeOtherException e) {
//                print("SomeOtherExcepiton: " + e);
            } catch (RuntimeException re) {
                if (i == 0) {

                }
                try {
                    throw re.getCause();
                } catch (FileNotFoundException e) {
//                    print("FileNotFoundException: " + e);
                    re.printStackTrace();
                } catch (IOException e) {
//                    print("IOException: " + e);
                } catch (Throwable throwable) {
//                    print("Throwable: " +throwable);
                }
            }
        }
    }























}
