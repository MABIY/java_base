package 第八章.练习题;

import static net.mindview.util.Print.print;

/**
 * Created by lh on 17-6-26.
 */
class Shared {
    private int refcount = 0;
    private static long counter = 0;
    private final long id = counter++;

    public Shared() {
        print("Creating " + this);
    }

    public int addRef() {
        return refcount++;
    }

    protected void dispose() {
        if (--refcount == 0) {
            print("Disposing " + this);
        }
    }

    @Override
    public String toString() {
        return "Share" + id;
    }
}

class Composing {
    private Shared shared;
    private static long counter = 0;
    private final long id = counter++;

    public Composing(Shared shared) {
        print("Creating " + this);
        this.shared = shared;
        System.out.println(this.shared.addRef());
    }

    protected void dispose() {
        print("disposing " + this);
        shared.dispose();
    }

    @Override
    public String toString() {
        return "Composing " + id;
    }
}
public class ReferenceCounting {
    public static void main(String[] args) {
        Shared shared = new Shared();
        Composing[] composings = {
                new Composing(shared),
                new Composing(shared),
                new Composing(shared),
                new Composing(shared),
                new Composing(shared),
        };
        for (Composing c : composings) {
            c.dispose();
        }
    }
}
