package 十一章;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

import static net.mindview.util.Print.print;

/**
 * Created by lh on 17-7-26.
 * Change Exercise 9 in the polymorphism chapter
 * to use an ArrayList to hold the Rodents an an
 * Iterator to move through their sequence.
 */
class Rodent {
    public void hop() {
        print("Rodent hopping");
    }

    public void scurry() {
        print("Rodent scurrying");
    }

    public void reproduce() {
        print("Making more rodents");
    }

    public String toString() {
       return "Rodent" ;
    }
}

class Mouse extends Rodent {
    public void hop() {
        print("Mouse hopping");
    }

    @Override
    public void scurry() {
        print("Mouse scurrying");
    }

    @Override
    public void reproduce() {
        print("Making more Mice"); }

    @Override
    public String toString() {
        return "Mouse";
    }
}

class Hamster extends Rodent {
    @Override
    public void hop() {
        print("Hamster hopping");
    }

    @Override
    public void scurry() {
        print("Hamster scurrying");
    }

    @Override
    public void reproduce() {
        print("Making more Hamsters");
    }

    @Override
    public String toString() {
        return "Hamster";
    }
}
public class E10_RodentIterator {
    public static void main(String[] args) {
        ArrayList<Rodent> rodents = new ArrayList<>();
        rodents.addAll(Arrays.asList(new Rodent(), new Mouse(), new Hamster()));
        Rodent r;
        for(Iterator<Rodent> it = rodents.iterator();it.hasNext();) {
            r = it.next();
            r.hop();
            r.scurry();
            r.reproduce();
            print(r);
        }
    }
}
