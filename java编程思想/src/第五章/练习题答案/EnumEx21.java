package 第五章.练习题答案;

/**
 * Created by lh on 17-6-23.
 */
public class EnumEx21 {
    public enum Bills {
        ONE,FIVE,TEN,TWENTY,FIFTY,HUNDRED
    }

    public static void main(String[] args) {
        for (Bills b : Bills.values()) {
            System.out.println(b + ", ordinal " + b.ordinal());
        }
    }
}
