package net.mindview.util;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

/**
 * Created by lh on 17-7-27.
 */
public class SetOfInteger {
    public static void main(String[] args) {
        Random random = new Random(47);
        Set<Integer> intset = new HashSet<Integer>();
        for (int i = 0; i < 10000; i++) {
            intset.add(random.nextInt(40));
        }
        System.out.println(intset);
    }
}
