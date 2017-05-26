package 第三章;

import static net.mindview.util.Print.print;

/**
 * Created by lh on 17-5-26.
 */
class Tank {
    int level;
}
public class Assignment {
    public static void main(String[] args) {
        Tank t1 = new Tank();
        Tank t2 = new Tank();
        t1.level = 9;
        t2.level = 47;
        print("1: t1.level: " + t1.level + ", t2.level: "+t2.level);

        t1 = t2;
        print("2: t1.level: " + t1.level +
        ", t2.level: " + t2.level);

        t1.level = 27;
        print("3. t1.level: " + t1.level + ", t2.level: " + t2.level);
    }
}
