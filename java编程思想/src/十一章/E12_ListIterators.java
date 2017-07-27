package 十一章;

import java.util.*;

/**
 * Created by lh on 17-7-27.
 * Create two List<Integer>s of the same size,
 * and populate one of them. Use ListIterators
 * to insert elements from the first List into
 * the second in reverse order .(You may want to
 * explore a number of different ways to solve)
 */
public class E12_ListIterators {
    static void reverse(List<Integer> list) {
        ListIterator<Integer> fwd = list.listIterator();
        ListIterator<Integer> rev = list.listIterator(list.size());
        int mid = list.size() >> 1;
        for (int i = 0; i < mid; i++) {
            Integer tmp = fwd.next();
            fwd.set(rev.previous());
            rev.set(tmp);
        }
    }

    public static void main(String[] args) {
        List<Integer> src = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> dest = new LinkedList<>(src);
        System.out.println("Source: " + src);
        System.out.println("destination:" + dest);
//        E12_ListIterators_Test.reverse(dest);
        E12_ListIterators_Test.reverse1(dest);
        System.out.println("source: " + src);
        System.out.println("destionation: " + dest);
    }
}

class E12_ListIterators_Test {
    public static void reverse(List<Integer> list) {
        ListIterator<Integer> fwd = list.listIterator();
        ListIterator<Integer> rev = list.listIterator(list.size());
        int min = list.size() >> 1;
        for (int i = 0; i < min; i++) {
            Integer tmp = fwd.next();
            fwd.set(rev.previous());
            rev.set(tmp);
        }
    }

    public static void reverse1(List<Integer> list) {
        Collections.reverse(list);
    }
}
