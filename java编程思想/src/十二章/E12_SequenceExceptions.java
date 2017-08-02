package 十二章;

/**
 * Created by lh on 17-8-2.
 * Modify innerclasses/Sequence.java so that it throwns an
 * appropriate exception if you try to put in too many elements
 */
class SequenceFullException extends RuntimeException {

}

interface Selector {
    boolean end();

    Object current();

    void next();
}

class Sequence2 {
    private Object[] objects;
    private int next;

    public Sequence2(int size) {
        objects = new Object[size];
    }

    public void add(Object x) {
        if (next < objects.length) {
            objects[next++] = x;
        } else {
            throw new SequenceFullException();
        }
    }

    private class SequenceSelector implements Selector {
        private int i;
        @Override
        public boolean end() {
            return objects.length == next;
        }

        @Override
        public Object current() {
            return objects[next];
        }

        @Override
        public void next() {
            if (i < objects.length) {
                i++;
            }
        }
    }
}

public class E12_SequenceExceptions {
    public static void main(String[] args) {
        Sequence2 sequence2 = new Sequence2(10);
        for (int i = 0; i < 11; i++) {
            sequence2.add(Integer.toString(i));
        }
    }
}
