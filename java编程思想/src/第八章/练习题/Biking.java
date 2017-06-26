package 第八章.练习题;

import static sun.misc.Version.println;

/**
 * Created by lh on 17-6-25.
 */
class Cycle {
    private String name = "Cycle";

    public static void travel(Cycle c) {
        System.out.println("Cycle.ride()" + c);
    }

    @Override
    public String toString() {
        return this.name;
    }
}

class Unicycle extends Cycle {
    private String name = "Unicycle";

    @Override
    public String toString() {
        return this.name;
    }
}

class Bicycle extends Cycle {
    private String name = "Bicycle";

    @Override
    public String toString() {
        return this.name;
    }
}

class Tricycle extends Cycle {
    private String name = "Tricycle";

    @Override
    public String toString() {
        return this.name;
    }
}
public class Biking {
    public static void ride(Cycle cycle) {
        cycle.travel(cycle);
    }

    public static void main(String[] args) {
        Unicycle u = new Unicycle();
        Bicycle b = new Bicycle();
        Tricycle t = new Tricycle();
        ride(u);
        ride(b);
        ride(t);
    }











































}
