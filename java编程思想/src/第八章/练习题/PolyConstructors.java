package 第八章.练习题;

import static net.mindview.util.Print.print;

/**
 * Created by lh on 17-6-26.
 */
class Glyph {
    public int radius =2;
    void drew() {
        print("Glyph.drwa()");
    }

    public Glyph() {
        print("Glyph() before draw()");
        drew();
        print("Glyph() after draw()");
    }
}

class RoundGlyph extends Glyph {
    private int radius = 1;

    public RoundGlyph(int radius) {
        this.radius = radius;
        print("RoundGlyph.RoundGlyph(), radius = " + radius);
    }

    @Override
    void drew() {
        print("RoundGlyph.draw(), radius = " +radius);
    }
}

public class PolyConstructors {
    public static void main(String[] args) {
        new RoundGlyph(5);
    }
}
