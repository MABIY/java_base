package 第五章.练习题答案;

/**
 * Created by lh on 17-6-22.
 */
class WebBank1 {
    boolean loggedIn = false;

    WebBank1(boolean logStatus) {
        loggedIn = logStatus;
    }

    void logOut() {
        loggedIn = false;
    }

    protected void finalize() {
        if (loggedIn) {
            System.out.println("Error: still logged in");
        }
    }

}
public class BankTest {
    public static void main(String[] args) {
        WebBank1 bank1 = new WebBank1(true);
        WebBank1 bank2 = new WebBank1(true);
       // proper cleanup: log out of bank1 before going home:
        bank1.logOut();
        //Forget to logout of bak2 and unnamed new bank
        //Attempts to finalize any missed banks:
        System.out.println("Tr 1:");
        System.runFinalization();
        System.out.println("Try 2: ");
        Runtime.getRuntime().runFinalization();
        System.out.println("Try 3: ");
        System.gc();
        System.out.println("Try 4: ");
        //using deprecated since 1.1 method
        System.runFinalizersOnExit(true);
    }
}
