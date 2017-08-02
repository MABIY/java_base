package 十二章;

import com.sun.org.omg.CORBA.ExcDescriptionSeqHelper;

/**
 * Created by lh on 17-8-2.
 * Each disposable object must be followed by a
 * try-finally
 */
class NeedsCleanup { //Construction can't fail
    private static long counter =1;
    private final long id = counter++;

    public void display() {
        System.out.println("NeedsCleanUp " + id + " disposed");
    }
}

class ConstructionException extends Exception {
}

class NeedsCleanup2 extends NeedsCleanup {
    // Construction can fail
    public NeedsCleanup2() throws ConstructionException {
    }
}
public class CleanupIdiom {
    public static void main(String[] args) {
        //Section 1:
        NeedsCleanup nc1 = new NeedsCleanup();
        try {
            // ...
        } finally {
            nc1.display();
        }

        //Section 2:
        //If construction cannot fail you can group objects
        NeedsCleanup nc2 = new NeedsCleanup();
        NeedsCleanup nc3 = new NeedsCleanup();
        try {
            // ...
        }finally {
            nc3.display(); // reverse order of construction
            nc2.display();
        }

        // Section 3:
        // If construction can fail you must guard each one:
        try {
            NeedsCleanup2 nc4 = new NeedsCleanup2();
            try {
                NeedsCleanup2 nc5 = new NeedsCleanup2();
                try {
                    //..
                } finally {
                    nc5.display();
                }
            } catch (ConstructionException e) { //nc5 constructor
                System.out.println(e);
            } finally {
                nc4.display();
            }
        } catch (ConstructionException e) { //nc4 constructor
            System.out.println(e);
        }
    }
}
