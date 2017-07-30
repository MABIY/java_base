package 十一章;

import net.mindview.util.TextFile;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by lh on 17-7-28.
 * Create a Map<String,ArrayList<Integer>>. Use
 * net.mindview.TextFile to open a text file and read it in a word at a time(use "\\W+)
 * as the second argument to the TextFile constructor
 */
public class E25_WordsInfo3 {
    public static void main(String[] args) {
        Map<String, ArrayList<Integer>> stat = new HashMap<>();
        int wordCount = 0;
        for (String word : new TextFile("E25_WordsInfo3.java", "\\W+")) {
            ArrayList<Integer> loc = stat.get(word);
            if (loc == null) {
                loc = new ArrayList<>();
                stat.put(word, loc);
            }
            loc.add(++wordCount);
        }
        System.out.println(stat);
    }
}
