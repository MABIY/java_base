package net.mindview.util;

import java.util.Random;
import java.util.SortedSet;
import java.util.TreeSet;

/**
 * Created by lh on 17-7-27.
 */
public class SortedSetOfInteger {

    public static void main(String[] args) {
        Random random = new Random(47);
        SortedSet<Integer> intset = new TreeSet<Integer>();
        for (int i = 0; i < 10000; i++) {
            intset.add(random.nextInt(30));
        }
        System.out.println(intset);
    }
}
