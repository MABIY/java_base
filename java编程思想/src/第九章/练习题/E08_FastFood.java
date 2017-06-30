package 第九章.练习题;

import 第八章.Sandwich;

import static net.mindview.util.Print.print;

/**
 * Created by lh on 17-6-30.
 * <p>
 * Create an interface called FastFood (with
 * appropriate methods ) in
 * polymorphism.Sandwich.java, and change Sandwich
 * so it also implements FastFood.
 */

interface FastFood {
    void rushOrder();

    void gobble();
}

class FastSandwich extends Sandwich implements FastFood {
    @Override
    public void rushOrder() {
        print("Rushing your sandwich order");
    }

    @Override
    public void gobble() {
        print("Chomp! Snort! Gobble!");
    }
}
public class E08_FastFood {
    public static void main(String[] args) {
        FastSandwich burger = new FastSandwich();
        print("Fries with that ?");
        print("Super Size?");
        burger.rushOrder();
        burger.gobble();
    }
}
