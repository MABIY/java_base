package 第五章;

/**
 * Created by lh on 17-6-20.
 */
class Rock2 {
    Rock2(int i) {
        System.out.println("Rock" + i + " " );
    }
}
public class SimpleConstructor2 {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            new Rock2(i);
        }
    }
}
