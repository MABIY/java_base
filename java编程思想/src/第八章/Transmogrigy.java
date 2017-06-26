package 第八章;

import static net.mindview.util.Print.print;

/**
 * Created by lh on 17-6-26.
 */
class Actor {
    public void act() {

    }
}

class HappyActor extends Actor {
    public void act() {
        print("HappyActor");
    }
}

class SadActor extends Actor {
    public void act() {
        print("SadActor");
    }
}

class Stage {
    private Actor actor = new HappyActor();

    public void change() {
        actor = new SadActor();
    }

    public void performPlay() {
        actor.act();
    }

}

public class Transmogrigy {
    public static void main(String[] args) {
        Stage stage = new Stage();
        stage.performPlay();
        stage.change();
        stage.performPlay();
    }
}
