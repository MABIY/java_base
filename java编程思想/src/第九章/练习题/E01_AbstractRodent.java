package 第九章.练习题;

import static net.mindview.util.Print.print;

/**
 * Created by lh on 17-6-30.
 */
abstract class Rodent {
    public  abstract void hop();

    public abstract void scurry();

    public abstract void reproduce();
}

class Mouse extends Rodent {
    @Override
    public void hop() {
        print("Mouse hopping");
    }

    @Override
    public void scurry() {
        print("Mouse scurrying");
    }

    @Override
    public void reproduce() {
        print("Making more Mice");
    }
}

class Gerbil extends Rodent {
    @Override
    public void hop() {
        print("Gerbil hopping");
    }

    @Override
    public void scurry() {
        print("Gerbil scurrying");
    }

    @Override
    public void reproduce() {
        print("Making more Gerbils");
    }

    @Override
    public String toString() {
       return "Gerbil" ;
    }
}

class Hamster extends Rodent {
    @Override
    public void hop() {
        print("Hamster hopping");
    }

    @Override
    public void scurry() {
        print("Making more Hamster");
    }

    @Override
    public void reproduce() {
        print("Making more Hamsters");
    }

    public String toString() {
        return "Hamster";
    }
}
public class E01_AbstractRodent {
    public static void main(String[] args) {
        Rodent[] rodents = {
                new Mouse(),
                new Gerbil(),
                new Hamster(),
        };
        for (Rodent r : rodents) {
            r.hop();
            r.scurry();
            r.reproduce();
            print(r);
        }
    }
}
