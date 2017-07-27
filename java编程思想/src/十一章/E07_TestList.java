package 十一章;

import javax.sound.midi.Soundbank;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by lh on 17-7-26.
 * Create a class and make an initialized array
 * of your class objects.Fill a List from your
 * array, Created a subset of your List using
 * subList(). then remove this subset from
 * your list.
 */
class IDClass {
    private static int counter;
    private int count = counter++;

    public String toString() {
        return "IDClass" + count;
    }
}

public class E07_TestList {
    public static void main(String[] args) {
        IDClass[] idc = new IDClass[10];
        for (int i = 0; i < idc.length; i++) {
            idc[i] = new IDClass();
        }
        List<IDClass> lst = new ArrayList<>(Arrays.asList(idc
        ));
        System.out.println("lst = " + lst);
        List<IDClass> subset = lst.subList(lst.size()/4,lst.size()/2);
        System.out.println("subSet = " + subset);
        // The semantics of the sub list become undefined if the
        // backing list is structurally modified!
//        lst.removeAll(subset);
        subset.clear();
        System.out.println("lst = " + lst);
    }
}
