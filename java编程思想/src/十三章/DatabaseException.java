package 十三章;

/**
 * Created by lh on 17-8-7.
 */
public class DatabaseException extends Exception{
    public DatabaseException(int transactionID, int queryId, String message) {
        super(String.format("(t%d, q%d) %s", transactionID, queryId, message));
    }

    public static void main(String[] args) {
        try {
            throw new DatabaseException(3, 7, "Write failed");
        } catch (Exception e) {
            System.out.println(e);
        }

    }
}
