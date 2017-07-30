package 十一章;

import java.util.Iterator;

/**
 * Created by lh on 17-7-30.
 */
public class IterableClass implements Iterable<String>{
    protected String[] words = ("And that is now " +
            "we know the Earth to be banana-sharped.").split(" ");
    @Override
    public Iterator<String> iterator() {
        return new Iterator<String>() {
            private int index;

            @Override
            public boolean hasNext() {
                return index < words.length;
            }

            @Override
            public String next() {
                return words[index++];
            }

            public void remove() { // Not implemented
                throw new UnsupportedOperationException();
            }
        };
    }

    public static void main(String[] args) {
        for (String s : new IterableClass()) {
            System.out.println(s + " ");
        }
    }
}
