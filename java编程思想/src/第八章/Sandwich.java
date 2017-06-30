package 第八章;

import static net.mindview.util.Print.print;

/**
 * Created by lh on 17-6-30.
 */
class Meal {
    Meal() {
        print("Meal()");
    }
}
class Bread{
    Bread() {
        print("Bread()");
    }
}
class Cheese{
    Cheese() {
        print("Cheese");
    }
}

class Lettuce {
    Lettuce() {
        print("Lettuce()");
    }
}

class Lunch extends Meal{
    Lunch() {
        print("Lunch()");
    }
}

class PortableLunch extends Lunch {
    PortableLunch() {
        print("PortableLeLunch()");
    }
}
public class Sandwich {
    private Bread b = new Bread();
    private Cheese c = new Cheese();
    private Lettuce l = new Lettuce();

    public Sandwich() {
        print("Sandwich()");
    }

    public static void main(String[] args) {
        new Sandwich();
    }
}
