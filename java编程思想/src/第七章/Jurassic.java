package 第七章;

/**
 * Created by lh on 17-6-25.
 */
class SamllBrain {

}

final class Dinosaur {
    int i = 7;
    int j = 1;
    SamllBrain x = new SamllBrain();

    void f() {

    }
}

//class Further extends Dinosaur {
//
//}

public class Jurassic {
    public static void main(String[] args) {
        Dinosaur n = new Dinosaur();
        n.f();
        n.i= 40;
        n.j++;
    }
}
