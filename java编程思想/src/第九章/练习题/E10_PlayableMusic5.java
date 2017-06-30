package 第九章.练习题;

import 第九章.music.Note;

import static net.mindview.util.Print.print;

/**
 * Created by lh on 17-6-30.
 * Add a Playable to modify music5.java, and move
 * the play() declaration from Instrument to
 * Playable. Include Playable
 */
interface Instrument2 {
    void adjust();
}

interface Playable {
    void play(Note n);
}

class Wind2 implements Instrument2, Playable {
    @Override
    public void adjust() {
        print(this + ".adjust()");
    }

    @Override
    public String toString() {
        return "Wind";
    }

    @Override
    public void play(Note n) {
        print(this + ".play()" + n);
    }
}

class Percussion2 implements Instrument2, Playable {
    @Override
    public void adjust() {
        print(this + ".adjust()");
    }

    @Override
    public void play(Note n) {
        print(this + ".play()" + n);
    }

    @Override
    public String toString() {
        return "Percussion";
    }
}

class Stringed2 implements Instrument2, Playable {
    @Override
    public void adjust() {
        print(this + ".adjust()");
    }

    @Override
    public String toString() {
        return "Stringed";
    }

    @Override
    public void play(Note n) {
        print(this + ".play()" + n);
    }
}

class Brass2 extends Wind2 {
    @Override
    public String toString() {
        return "Brass";
    }
}

class Woodwind2 extends Wind2 {
    public String toString() {
        return "Woodwind";
    }
}


public class E10_PlayableMusic5 {
    static void tune(Playable playable) {
        playable.play(Note.MIDDLE_C);
    }

    static void tuneAll(Playable[] e) {
        for (Playable p : e) {
            tune(p);
        }
    }

    public static void main(String[] args) {
        Playable[] orchestra = {
                new Wind2(),
                new Percussion2(),
                new Stringed2(),
                new Brass2(),
                new Woodwind2(),
        };
        tuneAll(orchestra);
    }
}
