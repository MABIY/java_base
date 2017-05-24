package 知识点.stand_Input_output;

import java.io.IOException;

/**
 * Created by lh on 17-5-24.
 */
public class Type {
    public static void main(String[] args) throws IOException {
        int ch;
        while((ch = System.in.read()) != -1){
            System.out.println((char) ch);
        }
    }
}
