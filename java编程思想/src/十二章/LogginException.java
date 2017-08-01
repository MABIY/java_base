package 十二章;

import com.sun.javafx.util.Logging;
import com.sun.org.omg.CORBA.ExcDescriptionSeqHelper;

import javax.security.auth.login.LoginException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.logging.Logger;

/**
 * Created by lh on 17-8-1.
 * An exception that reports throught a Logger.
 */
class LoggingException extends Exception {
    private static Logger logger =
            Logger.getLogger(LoggingException.class.getSimpleName());
   public LoggingException() {
       StringWriter trace = new StringWriter();
       printStackTrace(new PrintWriter(trace));
       logger.severe(trace.toString());
   }
}

public class LogginException {
    public static void main(String[] args) {
        try {
            throw new LoggingException();
        } catch (LoggingException e) {
            System.err.println("Caught " + e);
        }
        try {
            throw new LoggingException();
        } catch (LoggingException e) {
            System.err.println("Caught " +e );
        }
    }
}
