package 第十章;

/**
 * Created by lh on 17-7-11.
 * Create a class that holds a String,with a
 * toString() method that dispalys this String.
 * add serveral instances of your new class
 */
class StringHolder {
    private String data;

    StringHolder(String data) {
        this.data = data;
    }

    public String toString() {
        return data;
    }
}
public class E02_SequenceOfStringHolders {
    public static void main(String[] args) {
        Sequence sequence = new Sequence(10);
        for (int i = 0; i < 10; i++) {
            sequence.add(new StringHolder(Integer.toString(i)));
        }
        Selector selector = sequence.selector();
        while (!selector.end()) {
            System.out.print(selector.current() + " " );
            selector.next();
        }
    }
}
