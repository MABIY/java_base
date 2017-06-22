package 第五章;

import static net.mindview.util.Print.print;

/**
 * Created by lh on 17-6-22.
 */
class Bow1 {
    Bow1(int marker) {
        print("Bowl(" + marker + ")");
    }

    void f1(int marker) {
        print("f1(" + marker + ")");
    }
}

class Table {
    static Bow1 bow1 = new Bow1(1);

    Table() {
        print("Table()");
        bow12.f1(1);
    }

    void f2(int marker) {
       print("f2(" + marker + ")");
    }
    private final Bow1 bow12 = new Bow1(2);
}

class Cupboard {
    Bow1 bow13 = new Bow1(3);
    static Bow1 bow14 = new Bow1(2);

    Cupboard() {
        print("Cupboard()");
        bow14.f1(2);
    }

    void f3(int marker) {
        print("f3(" + marker + ")");
    }

    static Bow1 bow15 = new Bow1(5);
}
public class StaticInitialization {
    public static void main(String[] args) {
        print("Creating new Cupboard() in main");
        new Cupboard();
        print("Creating new Cupboard() in main");
        new Cupboard();
        table.f2(1);
        cupboard.f3(1);
    }
    static Table table = new Table();
    static  Cupboard cupboard = new Cupboard();
}
