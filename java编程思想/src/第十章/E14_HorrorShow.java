package 第十章;


/**
 * Created by lh on 17-7-14.
 * Modify interfaces/HorrorShow.java to implement
 * DangerousMonster and Vampire using anonymous
 * class.
 */

public class E14_HorrorShow {
    public static void main(String[] args) {
        DangerousMonster barney = new DangerousMonster() {
            @Override
            public void destroy() {

            }

            @Override
            public void menace() {

            }
        };
        HorrorShow.u(barney);
        HorrorShow.v(barney);
        Vampire vlad = new Vampire() {
            @Override
            public void drinkBlood() {

            }

            @Override
            public void destroy() {

            }

            @Override
            public void kill() {

            }

            @Override
            public void menace() {

            }
        };
        HorrorShow.u(vlad);
        HorrorShow.v(vlad);
        HorrorShow.w(vlad);

    }
}
