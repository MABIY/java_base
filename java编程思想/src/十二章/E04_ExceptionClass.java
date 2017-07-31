package 十二章;

/**
 * Created by lh on 17-7-31.
 * Create your own exception class using the
 * extends keyword.Write a constructor for this
 * class that  takes a String argument and store
 * it inside the object with a String reference.
 * write a method that prints out the stored
 * String. Create a try-catch clause to exercise
 * your new exception.
 */
// Following the instructions to the letter
class MyException4 extends Exception {
    String msg;

    public MyException4(String msg) {
        this.msg = msg;
    }

    public void printMsg() {
        System.out.println("ms = " + msg);
    }
}

// Or take a more clever approach.
// nothing that string storage and printing are
// built into Exception.
class MyException2 extends Exception {
    public MyException2(String s) {
        super(s);
    }
}
public class E04_ExceptionClass {
    public static void main(String[] args) {
        try {
            throw new MyException4("MyException message");
        } catch (MyException4 exception4) {
            exception4.printMsg();
        }
        try {
            throw new MyException2("MyException2 message");
        } catch (MyException2 exception2) {
            System.out.println("e.getMessage() = " + exception2.getMessage());
        }
    }
}
