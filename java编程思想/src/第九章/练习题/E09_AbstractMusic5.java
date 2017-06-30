package 第九章.练习题;

import com.sun.org.apache.bcel.internal.generic.INSTANCEOF;
import 第九章.music.Note;

import static net.mindview.util.Print.print;

/**
 * Created by lh on 17-6-30.
 * Refactor Music5.java by moving the common
 * methods in Wind, Percussion and Stringed into
 * an abstract class
 */
abstract class Instrument {
    public void play(Note n) {
        print(this + ".play()" + n);
    }

    public void adjust() {
        print(this + ".adjust()");
    }

    @Override
    public abstract String toString();
}

class Wind extends Instrument {
    @Override
    public String toString() {
        return "Wind";
    }
}

class Percussion extends Instrument {
    @Override
    public String toString() {
        return "Percussion";
    }
}

class Stringed extends Instrument {
    @Override
    public String toString() {
        return "Stringed";
    }
}

class Brass extends Wind {
    @Override
    public String toString() {
        return "Brass";
    }
}

class Woodwing extends Wind {
    public String toString() {
        return "Woodwind";
    }
}

public class E09_AbstractMusic5 {
    static void tune(Instrument instrument) {
        instrument.adjust();
        instrument.play(Note.MIDDLE_C);
    }

    static void tunneAll(Instrument[] instruments) {
        for (Instrument i : instruments) {
            tune(i);
        }
    }

    public static void main(String[] args) {
        Instrument[] orchestra = {
                new Wind(),
                new Percussion(),
                new Stringed(),
                new Brass(),
                new Woodwing(),
        };
        tunneAll(orchestra);

    }
}
