package 第五章.练习题答案;

/**
 * Created by lh on 17-6-22.
 */
class WebBank {
    boolean loggedIn = false;

    public WebBank(boolean loggedIn) {
        this.loggedIn = loggedIn;
    }

    void logIn() {
        loggedIn = true;
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
public class TerminationConditionEx {
    public static void main(String[] args) {
        WebBank bank1 = new WebBank(true);
        WebBank bank2 = new WebBank(true);
        // proper cleanup: log of bak1 before going home
        bank1.logOut();
        //Drop the refereence ,forget to cleanup:
        new WebBank(true);
        //Force.garbage collection and inalization:
        System.gc();
    }
}
