package 十一章;

import java.util.*;

/**
 * Created by lh on 17-7-23.
 * Adding groups fo elements to collection objects
 */
public class AddingGroups {
    public static void main(String[] args) {
        Collection<Integer> collection = new ArrayList<>(Arrays.<Integer>asList(1,2,3,4,5));
        collection.add(12);
        Integer[] moreInts = {6,7,8,9,10};
        collection.addAll(Arrays.asList(moreInts));
        //Runs significantly faster ,but you can't
        //Construct a collection this way:
        Collections.addAll(collection,11,12,13,14,15);
        Collections.addAll(collection, moreInts);
        // Produces a list "backed by " an array:
        List<Integer> list = Arrays.asList(16, 17, 18, 19, 20);
        list.set(1,99);
    }
}
