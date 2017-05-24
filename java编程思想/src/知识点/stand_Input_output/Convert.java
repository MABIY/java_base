package 知识点.stand_Input_output;

import java.io.IOException;

/**
 * Created by lh on 17-5-24.
 */
public class Convert {
    public static void main(String[] args) throws IOException {
        System.out.print("Please enter a number:");
        int num = 0;
        int ch;
        while ((ch = System.in.read()) != '\n') {
            if (ch >= '0' && ch <= '9') {
                num *= 10;
                num += ch - '0';
            } else {
                break;
            }
            System.out.println("num = " + num);
            System.out.println("num squared =" + num * num);
        }
    }
}
