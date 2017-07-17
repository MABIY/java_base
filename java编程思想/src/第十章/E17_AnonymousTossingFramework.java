package 第十章;

/**
 * Created by lh on 17-7-17.
 * Use anonymous inner classes to modify the solution
 * to Exercise 19 from the Interfaces chapter
 */
interface Tossing {
    boolean event();
}

interface TossingFactory {
    Tossing getTossing();
}

class CoinTossing implements Tossing {
    private int events;
    private static final int EVENT = 2;

    @Override
    public boolean event() {
        System.out.println("Coin tossing event" + EVENT);
        return ++events != EVENT;
    }

    public static TossingFactory factory = new TossingFactory() {
        @Override
        public Tossing getTossing() {
            return new CoinTossing();
        }
    };
}

class DiceTossing implements Tossing {
    private int events;
    private static final int EVENTS = 6;
    @Override
    public boolean event() {
        System.out.println("Dice tossing event" + events);
        return ++events !=EVENTS;
    }

    public static TossingFactory factory = new TossingFactory() {
        @Override
        public Tossing getTossing() {
            return new DiceTossing();
        }
    };
}

public class E17_AnonymousTossingFramework {
    public static void simulate(TossingFactory factory) {
        Tossing t = factory.getTossing();
        while (t.event());
    }

    public static void main(String[] args) {
        simulate(CoinTossing.factory);
        simulate(DiceTossing.factory);
    }
}
