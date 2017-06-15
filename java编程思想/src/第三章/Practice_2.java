package 第三章;


import static net.mindview.util.Print.print;

/**
 * Created by lh on 17-6-15.
 */
class Tube {
    float level;
}
public class Practice_2 {
    public static void main(String[] args) {
        Tube t1 = new Tube();
        Tube t2 = new Tube();
        t1.level = 0.9f;
        t2.level = 0.47f;
        print("1: t1.lelve: " +   t1.level + "t2.level: " + t2.level);
        t1 = t2;
        print("2: t1.lelve: " +   t1.level + "t2.level: " + t2.level);
        t1.level = 0.27f;
        print("2: t1.lelve: " +  t1.level + "t2.level: " + t2.level);
    }
}
