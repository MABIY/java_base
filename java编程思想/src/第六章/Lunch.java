package 第六章;

/**
 * Created by lh on 17-6-23.
 */
class Soup1 {
    private Soup1() { }

    //(1) Alow creation  via static method
    public static Soup1 makeSoup() {
        return new Soup1();
    }
}

class Soup2 {
    private Soup2() {

    }
    //(2) create a static object and return a refereence
    // upon request. (The "Singleton" pattern);
    private static Soup2 ps1 = new Soup2();

    public static Soup2 access() {
        return ps1;
    }

    public void f() {

    }
}

//Only one public class allowed per file
public class Lunch {
    void testPrivate() {
//        Can't do this ! class allowed per file:'
//        Soup1 soup1 = new Soup1();
    }

    void testStatic() {
        Soup1 soup = Soup1.makeSoup();
    }

    void testStringleton() {
        Soup2.access().f();
    }
}
