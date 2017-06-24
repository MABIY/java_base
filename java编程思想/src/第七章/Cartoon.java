package 第七章;

import static net.mindview.util.Print.print;

/**
 * Created by lh on 17-6-24.
 */
class Art {
    public Art() {
        print("Art constructor");
    }
}

class Drawing extends Art {
    Drawing() {
        print("Drawing constructor");
    }
}
public class Cartoon extends Drawing{
    public Cartoon() {
        print("Cartoon constructor");
    }

    public static void main(String[] args) {
        Cartoon x = new Cartoon();
    }
}
