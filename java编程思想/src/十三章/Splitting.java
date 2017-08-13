package 十三章;

import java.util.Arrays;

/**
 * Created by lh on 17-8-7.
 */
public class Splitting {
    public static String knights = "ThEn, when you have found the shrubbery, you must" +
    "cut down the mightiest tree in the forest..."+"with... a herring!";

    public static void split(String regex) {
        System.out.println(
                Arrays.toString(knights.split(regex))
        );
    }

    public static void main(String[] args) {
        split(" "); //Doesn't have to conatin regex chars
        split("\\W+"); //Non-word characrers
        split("n\\W+");
    }

}
