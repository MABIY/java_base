package 第十章;

/**
 * Created by lh on 17-7-5.
 * Create a class that holds a String. with a
 * toString() method that displays this String.
 * Add several instances of your new class to
 * Sequence object , then display them.
 */
class StringHolder {
    private String data;

    StringHolder(String data) {
        this.data = data;
    }

    @Override
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
            System.out.println(selector.current() + " ");
            selector.next();
        }
    }
}
