package 第七章;

import static net.mindview.util.Print.print;

/**
 * Created by lh on 17-6-24.
 */
class Game {
    public Game(int i) {
        print("Game constructor");
    }
}

class BoardGame extends Game {

    public BoardGame(int i) {
        super(i);
    }
}
public class Chess extends BoardGame {

    public Chess() {
        super(11);
        System.out.println("Chess Constructor");
    }

    public static void main(String[] args) {
        Chess x = new Chess();
    }
}
