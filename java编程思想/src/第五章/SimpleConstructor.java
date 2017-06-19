package 第五章;

/**
 * Created by lh on 17-6-20.
 */
class Rock {
    Rock() { // This is  the constructor
        System.out.println("Rock");
    }
}
public class SimpleConstructor {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            new Rock();
        }
    }

}
