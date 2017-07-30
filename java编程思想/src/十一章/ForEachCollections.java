package 十一章;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;

/**
 * Created by lh on 17-7-30.
 * All conllections work with foreach.
 */
public class ForEachCollections {
    public static void main(String[] args) {
        Collection<String> cs = new LinkedList<String>();
        Collections.addAll(cs,"Take the long way home".split(" "));
        for (String s : cs) {
            System.out.print("'"  + s + "' ");
        }
    }
}
