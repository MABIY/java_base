package 第九章.music5;

import 第九章.music.Note;

import static net.mindview.util.Print.print;

/**
 * Created by lh on 17-6-30.
 */
interface Instrument {
    //Compile-time constant
    int VALUE = 5; // public static & final

    // Cannot have method definitions
    void play(Note n);

    void adjust();
}

class Wind implements Instrument {
    @Override
    public void play(Note n) {
        print(this + ".play()" + n);
    }

    @Override
    public void adjust() {
        print(this + ".adjust()");
    }

    @Override
    public String toString() {
        return "Wind";
    }
}

class Percussion implements Instrument {
    @Override
    public void play(Note n) {
        print(this + ".play()" + n);
    }

    @Override
    public void adjust() {
        print(this + ".adjust()");
    }

    @Override
    public String toString() {
        return "Percussion";
    }
}

class Stringed implements Instrument {
    @Override
    public void play(Note n) {
        print(this + ".play()" + n);
    }

    @Override
    public String toString() {
        return "Stringed";
    }

    @Override
    public void adjust() {
        print(this + ".adjust()");
    }
}

class Brass extends Wind {
    @Override
    public String toString() {
        return "Brass";
    }
}

class Woodwind extends Wind {
    @Override
    public String toString() {
        return "Woodwind";
    }
}


public class Music5 {
    //Doesn't care about type,so new types
    // added to the system still work right：
    static void tune(Instrument i) {
        i.play(Note.MIDDLE_C);
    }

    static void tunneAll(Instrument[] instruments) {
        for (Instrument e : instruments) {
           tune(e);
        }
    }

    public static void main(String[] args) {
        //Upcasting during addition to the array:
        Instrument[] orchestra = {
                new Wind(),
                new Percussion(),
                new Stringed(),
                new Brass(),
                new Woodwind(),
        };
        tunneAll(orchestra);
    }
}
