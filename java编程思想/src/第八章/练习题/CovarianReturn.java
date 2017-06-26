package 第八章.练习题;

/**
 * Created by lh on 17-6-26.
 */
class Grain {
    @Override
    public String toString() {
        return "Granin";
    }
}

class Wheat extends Grain {
    @Override
    public String toString() {
        return "Wheat";
    }
}

class Mill {
    Grain procss() {
        return new Grain();
    }
}

class WheatMill extends Mill {
    @Override
    Wheat procss() {
        return new Wheat();
    }
}

public class CovarianReturn {
    public static void main(String[] args) {
        Mill m = new Mill();
        Grain g = m.procss();
        System.out.println(g);
        m = new WheatMill();
        g = m.procss();
        System.out.println(g);
    }
}
