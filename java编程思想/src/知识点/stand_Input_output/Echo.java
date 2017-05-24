package 知识点.stand_Input_output;

import java.io.IOException;

/**
 * Created by lh on 17-5-24.
 */
public class Echo {
    public static void main(String[] args) throws IOException {
        int ch;
        System.out.println("Enter some text: ");
        while ((ch = System.in.read()) != '\n') {
            System.out.println(ch);
        }
    }
}
