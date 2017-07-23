package 十一章;

import java.util.Collection;
import java.util.HashSet;

/**
 * Created by lh on 17-7-23.
 * Modify SimpleCollection.java to use a set for c.
 */
public class E02_SimpleCollection2 {
    public static void main(String[] args) {
        Collection<Integer> c = new HashSet<>();
/*        for (int i = 0; i < 10; i++) {
            c.add(i);//Autoboxing
        }
        for (Integer i : c) {
            System.out.print(i + ", ");
        }*/
        c.add(null);
    }
}
