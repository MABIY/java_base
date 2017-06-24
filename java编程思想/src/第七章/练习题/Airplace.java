package 第七章.练习题;


import static net.mindview.util.Print.print;

/**
 * Created by lh on 17-6-24.
 */
class Engine {
    private String s;

    Engine() {
        System.out.println("Engine()");
        s = "Constructed";
    }

    public String toString() {
        return s;
    }
}
public class Airplace {
    private String fuselage ,wings,tail;
    private Engine e;
    public Airplace() {
        System.out.println("Inside Airplance()");
        fuselage = "Body";
        wings = "Airfoils";
        tail = "Empennage";
    }

    public String toString() {
        if (e == null) {
            e = new Engine();
        }
        return "fuselage = " + fuselage + ". " +
                "wings = " + wings + ". " +
                "tail = " + tail + ". " +
                "Engine = " + e;
    }

    public static void main(String[] args) {
        Airplace N1234 = new Airplace();
        print(N1234);
    }
}
