package 第五章.练习题答案;
import  第五章.练习题答案.EnumEx21.Bills;

/**
 * Created by lh on 17-6-23.
 */
public class Wallet {
    Bills b;

    public static void main(String[] args) {
        for (Bills b : Bills.values()) {
            System.out.println("Worth: ");
            switch (b) {
                case ONE:
                    System.out.println("$1");
                    break;
                case FIVE:
                    System.out.println("$5");
                    break;
                case TEN:
                    System.out.println("$10");
                    break;
                case TWENTY:
                    System.out.println("$20");
                    break;
                case FIFTY:
                    System.out.println("$50");
                    break;
                case HUNDRED:
                    System.out.println("$100");
                    break;
                default:break;
            }
        }
    }
}
