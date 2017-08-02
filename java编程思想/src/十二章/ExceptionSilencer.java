package 十二章;

/**
 * Created by lh on 17-8-2.
 */
public class ExceptionSilencer {
    public static void main(String[] args) {
        try {
            throw new RuntimeException();
        }finally {
            //Using 'return ' inside the finally block
            // will silence any thrown exception
            return;
        }
    }
}
