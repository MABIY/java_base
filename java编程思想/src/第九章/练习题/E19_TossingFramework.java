package 第九章.练习题;

/**
 * Created by lh on 17-7-3.
 * Create a framework using Factory Methods that
 * performs both coin tossing and dice tossing
 */

interface Tossing {
    boolean event();
}

interface TossingFactory {
    Tossing getTossing();
}

class CoinTossing implements Tossing {
    private int events;
    private static final int EVENTS = 2;
    @Override
    public boolean event() {
        System.out.println("Coin tossing event " + events);
        return ++events != EVENTS;
    }
}

class CoinTossingFactory implements TossingFactory {
    @Override
    public Tossing getTossing() {
        return new CoinTossing();
    }
}

class DiceTossing implements Tossing {
    private int events;
    private static final int EVENTS = 6;
    @Override
    public boolean event() {
        System.out.println("Dice tossing event " + events);
        return ++events != EVENTS;
    }
}

class DiceTossingFactory implements TossingFactory {
    @Override
    public Tossing getTossing() {
        return new DiceTossing();
    }
}
public class E19_TossingFramework {
    public static void simulate(TossingFactory fact) {
        Tossing t = fact.getTossing();
        while (t.event());
    }

    public static void main(String[] args) {
        simulate(new CoinTossingFactory());
        simulate(new DiceTossingFactory());
    }
}
