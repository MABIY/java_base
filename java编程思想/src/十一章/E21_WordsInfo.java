package 十一章;

import net.mindview.util.TextFile;

import java.util.*;

/**
 * Created by lh on 17-7-28.
 * Using a Map<String,Integer>,follow the form of
 * uniqueWords.java to create a program that counts
 * the occurrence of words in a file..Sort the
 * results using Collections.sort() with a second
 * argument of String.CASE_INSENSITIVE_ORDER  (to
 * produce an alphabetic sort). and dispaly the reuslt.
 */
public class E21_WordsInfo {
    public static void main(String[] args) {
        Map<String, Integer> wordsStat = new HashMap<>();
        for (String word : new TextFile("E21_WordsInfo.java", "\\W+")) {
            Integer freq = wordsStat.get(word);
            wordsStat.put(word, freq == null ? 1 : freq + 1);
        }
        List<String> keys = new ArrayList<>(wordsStat.keySet());
        Collections.sort(keys, String.CASE_INSENSITIVE_ORDER);
        for (String key : keys) {
            System.out.println(key + " => " + wordsStat.get(key));
        }
    }
}
