package 十一章;

import java.util.LinkedList;
import java.util.ListIterator;

/**
 * Created by lh on 17-7-27.
 * Create an empty LinkedList<Integer>.Using a
 * ListIterator, and Integers to the List by always
 * inserting the int the middle of the list.
 */
public class E14_MiddleInsertion {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        ListIterator<Integer> it = list.listIterator();
        for (int i = 0; i < 10; i++) {
            it.add(i);
            if (i % 2 == 0) {
               it.previous();
            }
        }
        System.out.println(list);
    }
}
