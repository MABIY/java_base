package 第五章;

/**
 * Created by lh on 17-6-22.
 */
class Book {
    boolean checkedout = false;

    Book(boolean checkout) {
        checkedout = checkout;
    }

    void checkIn() {
        checkedout = false;
    }

    protected void finalize() throws Throwable {
        if (checkedout) {
            System.out.println("Error: checked out");
            super.finalize();
        }
    }
}
public class TerminationCodition {
    public static void main(String[] args) {
        Book novel = new Book(true);
        //Proper cleanup
        novel.checkIn();
        //Drop the reference,forget to clean up;
        new Book(true);
        // Force garbage collection & finalization:
        System.gc();
    }
}
