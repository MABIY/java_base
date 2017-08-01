package 十二章;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.logging.Logger;

/**
 * Created by lh on 17-8-1.
 * Modify Exercise 3 so that the catch clause logs the reuslts
 */
public class E07_LoggedArrayINdexBounds {
    private static Logger logger = Logger.getLogger(E07_LoggedArrayINdexBounds.class.getName());

    static void logException(Exception e) {
        StringWriter trace = new StringWriter();
        e.printStackTrace(new PrintWriter(trace));
        logger.severe(trace.toString());
    }

    public static void main(String[] args) {
        char[] array = new char[10];
        try {
            array[10] = 'x';
        } catch (ArrayIndexOutOfBoundsException e) {
            logException(e);
        }
    }
}
