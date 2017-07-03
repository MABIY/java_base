package 第九章.练习题;

/**
 * Created by lh on 17-7-3.
 */
interface CanFight {
    void fight();
}

interface CanSwim {
    void swim();
}

interface CanFly {
    void fly();
}

interface CanClimb {

}

class ActionCharacter {
    public void fight() {

    }
}

class Hero extends ActionCharacter implements CanFight,CanSwim,CanFly{
    @Override
    public void swim() {

    }

    @Override
    public void fly() {

    }
}
public class Adventure {
    public static void t(CanFight x) {
        x.fight();
    }

    public static void u(CanSwim x) {
        x.swim();
    }

    public static void v(CanFly x) {
        x.fly();
    }

    public static void w(ActionCharacter x) {
        x.fight();
    }

    public static void main(String[] args) {
        Hero h = new Hero();
        t(h); //Treat it as a Canfight
        u(h); // Treat it as a CanSwim
        v(h); //Treat is as a CanFly
        w(h); //Treat is as an ActionCharacter
    }
}
