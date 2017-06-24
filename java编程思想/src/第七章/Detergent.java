package 第七章;

import static net.mindview.util.Print.print;

/**
 * Created by lh on 17-6-24.
 */
public class Detergent extends Cleanser {
    // Change a method:
    @Override
    public void scrub() {
       append(" Detergent,scrub()");
       super.scrub(); //Call base-class version
    }

    //Add mehods to the interface
    public void foam() {
        append(" foam()");
    }

    // Test teh new Class;
    public static void main(String[] args) {
        Detergent x = new Detergent();
        x.dilute();
        x.apply();
        x.scrub();
        x.foam();
        print(x);
        print("Testing base class:");
        Cleanser.main(args);
    }
}
