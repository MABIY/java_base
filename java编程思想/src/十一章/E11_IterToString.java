package 十一章;

import java.util.*;

/**
 * Created by lh on 17-7-27.
 * Write a method that uses an Iterator to step
 * through a Collection and print the toString()
 * of each object in the container.Fil all the
 * different types of Collections with objects and
 * apply your method to each container.
 */
public class E11_IterToString {
    public static void printToString(Iterator<?> it) {
        while (it.hasNext()) {
            System.out.println(it.next().toString());
        }
    }

    public static void main(String[] args) {
        List<Collection<String>> ca = Arrays.<Collection<String>>asList(new ArrayList<String>()
                , new LinkedList<String>()
                , new HashSet<String>(),
                new TreeSet<String>());
        for (Collection<String> c : ca) {
            E04_MovieNameGenerator.fill(c);
        }
        for (Collection<String> c : ca) {
            printToString(c.iterator());
        }
    }
}
