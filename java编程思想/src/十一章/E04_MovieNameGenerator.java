package 十一章;

import net.mindview.util.Generator;

import java.util.*;

import static net.mindview.util.Print.print;

/**
 * Created by lh on 17-7-24.
 * Create a generator class that produces String objects
 * with the name of characters from your favorite
 * movie each time you call next(),and then loops
 * around to begging of character list
 * when it runs out of names, Use this generator to
 * fill an array,an ArrayList,a LinkedList,a HashSet,
 * a LinkedHashSet,and a TreeSet,then print each container.
 */
class MovieNameGenerator implements Generator<String> {

    String[] characters = {"Grumpy","Happy","Sleepy","Dopey","Dopey","Doc",
    "Sneezy","Bashful","Snow White","Witch Queen","Prince",};
    int next;
    @Override
    public String next() {
        String r = characters[next];
        next = (next + 1) % characters.length;
        return r;
    }
}
public class E04_MovieNameGenerator {
    private static final MovieNameGenerator mng =
            new MovieNameGenerator();

    static String[] fill(String[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = mng.next();
        }
        return array;
    }

    static Collection<String> fill(Collection<String> collection) {
        for (int i = 0; i < 5; i++) {
            collection.add(mng.next());
        }
        return collection;
    }
    public static void main(String[] args) {
        print(Arrays.toString(fill(new String[5])));
        print(fill(new ArrayList<String>()));
        print(fill(new LinkedList<String>()));
        print(fill(new HashSet<String>()));
        print(fill(new LinkedHashSet<String>()));
        print(fill(new TreeSet<String>()));
    }
}
