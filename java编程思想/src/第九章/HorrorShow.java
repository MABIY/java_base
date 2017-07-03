package 第九章;

/**
 * Created by lh on 17-7-3.
 */
interface Monster {
    void menace();
}

interface DangerousMonster extends Monster {
    void destroy();
}

interface Letha1 {
    void kill();
}

class DragonZilla implements DangerousMonster {
    @Override
    public void menace() {

    }

    @Override
    public void destroy() {

    }
}

interface Vampire extends DangerousMonster, Letha1 {
    void drinkBlood();
}

class VeryBadVampire implements Vampire {
    @Override
    public void menace() {

    }

    @Override
    public void destroy() {

    }

    @Override
    public void kill() {

    }

    @Override
    public void drinkBlood() {

    }
}
public class HorrorShow {
    static void u(Monster b) {
        b.menace();
    }

    static void v(DangerousMonster dangerousMonster) {
        dangerousMonster.menace();
        dangerousMonster.destroy();
    }

    static void w(Letha1 l) {
        l.kill();
    }

    public static void main(String[] args) {
        DangerousMonster barney = new DragonZilla();
        u(barney);
        v(barney);
        Vampire vlad = new VeryBadVampire();
        u(vlad);
        v(vlad);
        w(vlad);
    }
}
