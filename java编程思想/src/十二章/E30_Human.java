package 十二章;

/**
 * Created by lh on 17-8-2.
 * Modify main() in Human.ajva so that the technique
 * In TurnOffchecking.java is used to
 * handle the different types of exceptions.
 */
public class E30_Human {
    static void throwRuntimeException(int type){
        try {
            switch (type) {
                case 0:
                    throw new Annoyance();
                case 1:
                    throw new Sneeze();
                default:
                    return;
            }
        } catch (Exception e) { //Adapt to unchecked
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {
        // Let RuntimeExceptions to out of the method:
        throwRuntimeException(2);
        // or let catch exceptions:
        for (int i = 0; i < 2; i++) {
            try {
                throwRuntimeException(i);
            } catch (RuntimeException re) {
                try {
                    throw re.getCause();
                } catch (Sneeze sneeze) {
                    System.out.println("Caught Sneeze");
                } catch (Annoyance annoyance) {
                    System.out.println("Caught Annoyace");
                } catch (Throwable t) {
                    System.out.println(t);
                }
            }
        }
    }
}
