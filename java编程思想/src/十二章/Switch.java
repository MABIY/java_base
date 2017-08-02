package 十二章;

import static net.mindview.util.Print.print;

/**
 * Created by lh on 17-8-2.
 */
public class Switch {
    private boolean state = false;

    public boolean read() {
        return state;
    }

    public void on() {
        state = true;
        print(this);
    }

    public void off() {
        state = false;
        print(this);
    }

    public String toString() {
        return state ? "on" : "off";
    }
}
