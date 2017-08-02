package 十二章;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * Created by lh on 17-8-2.
 * (ThrowsException)
 *********************Exercise 26********************
 * Change the file name String in MainException.java to
 * name a file that doesn't exist .Run program and
 * note the result
 */
public class E26_MainException {
    // Pass all exception to the console:
    public static void main(String[] args) throws IOException {
        //Open the file
        FileInputStream file = new FileInputStream("DoesnotExist.file");
        //Use the file...
        //Close the file:
        file.close();
    }
}
