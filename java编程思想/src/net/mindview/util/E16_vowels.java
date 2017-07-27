package net.mindview.util;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import static net.mindview.util.Print.print;

/**
 * Created by lh on 17-7-27.
 * Create a Set of the vowels,Working from
 * UniqueWords.java,count and display the number of
 * vowels in each input word, and also display the
 * total number of vowels in the input file.
 */
public class E16_vowels {
    private final static Set<Character> vowels = new HashSet<Character>(Arrays.asList('a','e','o','u','i','A','E','O','U','I'));

    public static void main(String[] args) {
        HashSet<String> processedWords = new HashSet<>();
        int fileVowels = 0;
        int wordVowels;
        for (String word : new TextFile("E16_vowels.java", "\\W+")) {
           wordVowels = 0;
            for (char letter : word.toCharArray()) {
                if (vowels.contains(letter)) {
                    wordVowels++;
                }
            }
            if (!processedWords.contains(word)) {
                processedWords.add(word);
                print(word + " has " +wordVowels + "vowel(s)");
            }
            fileVowels += wordVowels;
        }
        print("Total number of vowels in file: " + fileVowels);
    }
}
