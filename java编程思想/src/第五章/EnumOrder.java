package 第五章;

/**
 * Created by lh on 17-6-23.
 */
public class EnumOrder {
    public static void main(String[] args) {
        for (Spiciness s : Spiciness.values()) {
            System.out.println(s + " , ordinal " + s.ordinal());
        }
    }
}
