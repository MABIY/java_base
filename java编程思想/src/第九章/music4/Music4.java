package 第九章.music4;

import 第九章.music.Note;

import static net.mindview.util.Print.print;

/**
 * Created by lh on 17-6-29.
 */
abstract class Instrument {
    private int i; //Storage allocated for each

    public abstract void play(Note note);

    public String what() {
        return "Instrument";
    }

    public abstract void adjust();
}

class Wind extends Instrument {
    @Override
    public void play(Note note) {
        print("Wind.play()");
    }

    @Override
    public void adjust() {
    }
}

class Percussion extends Instrument {
    @Override
    public void play(Note note) {
        print("Percussion.play()");
    }

    public String what() {
        return "Persussion";
    }

    @Override
    public void adjust() {
    }
}

class Stringed extends Instrument {
    @Override
    public void play(Note note) {
        print("Stringed.play()");
    }
    public String what() {
        return "Stringed";
    }

    @Override
    public void adjust() {

    }
}

class Brass extends Wind {
    @Override
    public void play(Note note) {
        print("Brass.play() " + note);
    }

    @Override
    public void adjust() {
        print("Brass.adjust()");
    }
}

class Woodwind extends Wind {
    @Override
    public void play(Note note) {
        print("Woodwind.play()");
    }

    public String what() {
        return "Woodwin";
    }
}

public class Music4 {
    static void tune(Instrument i) {
       i.play(Note.MIDDLE_C);
    }
    static void tuneAll(Instrument[] e) {
        for (Instrument i : e) {
            tune(i);
        }
    }

    public static void main(String[] args) {
        Instrument[] orchestra = {
                new Wind(),
                new Percussion(),
                new Stringed(),
                new Brass(),
                new Woodwind(),
        };
        tuneAll(orchestra);
    }
}






































