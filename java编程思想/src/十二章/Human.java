package 十二章;

/**
 * Created by lh on 17-8-2.
 */
class Annoyance extends Exception {
}

class Sneeze extends Annoyance {
}
public class Human {
    public static void main(String[] args) {
        // Catch the exact type:
        try {
            throw new Sneeze();
        } catch (Sneeze sneeze) {
            System.out.println("Caught Sneeze");
        } catch (Annoyance annoyance) {
            System.out.println("Caught Annoyance");
        }
    }
}
