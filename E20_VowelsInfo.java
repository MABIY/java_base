package 十一章;

import net.mindview.util.TextFile;

import java.util.*;

import static net.mindview.util.Print.print;

/**
 * Created by lh on 17-7-28.
 * Modify Exercise 16 to count the occurrence of
 * each vowel.
 */
public class E20_VowelsInfo {
    private final static Set<Character> vowels =
            new HashSet<>(Arrays.asList('a','e','o','u','i','A','E','O','U','I'));
    static void updateStat(Map<Character,Integer> stat,char letter) {
        Character ch = Character.toLowerCase(letter);
        Integer freq = stat.get(ch);
        stat.put(ch,freq == null ? 1: ++freq);
    }

    public static void main(String[] args) {
        HashMap<Character, Integer> fileStat = new HashMap<>();
        HashSet<String> processedWords = new HashSet<>();
        HashMap<Character,Integer> wordStat = new HashMap<>();
        for (String word : new TextFile("E20_VowelsInfo.java", "\\W+")) {
            wordStat.clear();
            for (char letter : word.toCharArray()) {
                if (vowels.contains(letter)) {
                    updateStat(wordStat, letter);
                    updateStat(fileStat, letter);
                }
            }
            if (!processedWords.contains(word)) {
                processedWords.add(word);
                print("Vowels in " + word + ": " + wordStat);
            }
        }
        print("******************************");
        print("Vowels in the whole file: " + fileStat);
    }
}
