package 第三章;

import java.util.Random;

import static net.mindview.util.Print.print;

/**
 * Created by lh on 17-6-16.
 */
public class CoinToss {
    public static void main(String[] args) {
        Random rand = new Random();
        int coin = rand.nextInt();
        if(coin % 2 == 0)
            print("heads");
        else
            print("tails");
    }
}
