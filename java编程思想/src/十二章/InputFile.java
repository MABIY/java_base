package 十二章;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by lh on 17-8-2.
 * Paying attention to exceptions in constructors
 */
public class InputFile {
    private BufferedReader in;

    public InputFile(String fname) throws Exception {
        try {
            in = new BufferedReader(new FileReader(fname));
            //Other code that might thrown exceptions
        } catch (FileNotFoundException e) {
            System.out.println("Cound not open " + fname);
            // Wasn't open , so don't close it
            throw e;
        } catch (Exception e) {
            // ALl other exceptions must close it
            try {
                in.close();
            } catch (IOException e1) {
                System.out.println("in.close() unsuccessful");
            } ;
            throw e; //Rethrow
        }finally {
            // Don't close it here!!!
        }
    }

    public String getLine() {
        String s;
        try {
            s = in.readLine();
        } catch (IOException e) {
            throw new RuntimeException("readLine() failed");
        }
        return s;
    }

    public void dispose() {
        try {
            in.close();
        } catch (IOException e) {
            throw new RuntimeException("in.close() failed");
        }
    }
}
