package net.mindview.util;

import java.util.Set;
import java.util.TreeSet;

/**
 * Created by lh on 17-7-27.
 */
public class UniqueWords {
    public static void main(String[] args) {
        Set<String> words = new TreeSet<>(
                new TextFile("SetOperations.java","\\W+")
        );
        System.out.println(words);
    }
}
