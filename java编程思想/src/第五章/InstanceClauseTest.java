package 第五章;

/**
 * Created by lh on 17-6-22.
 */
class Tester {
    String s;
    {
        s = "Initializing string in Tester";
        System.out.println(s);
    }

    Tester() {
        System.out.println("Tester");
    }
}

public class InstanceClauseTest {
    public static void main(String[] args) {
        new Tester();
    }
}
