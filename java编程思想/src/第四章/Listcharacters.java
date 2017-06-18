package 第四章;

/**
 * Created by lh on 17-6-18.
 */
public class Listcharacters {
    public static void main(String[] args) {
        for (char c = 0; c < 128; c++) {
            if (Character.isLowerCase(c))
                System.out.println("value:" + (int) c + " character: " + c);
        }
    }
}
