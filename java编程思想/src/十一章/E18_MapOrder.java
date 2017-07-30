package 十一章;

import net.mindview.util.Countries;

import java.util.*;

/**
 * Created by lh on 17-7-27.
 * Fill a hashMap with key-value pairs.Print the results
 * to show ordering by hash code.Extract the pairs, sort by key,
 * and place the result into a LinkedHashMap.
 * Show that insertion order is maintained
 */
public class E18_MapOrder {
    public static void main(String[] args) {
        Map<String, String> m1 = new HashMap<>(Countries.capitals(25));
        System.out.println(m1);
        String[] keys = m1.keySet().toArray(new String[0]);
        Arrays.sort(keys);
        Map<String, String> me = new LinkedHashMap<>();
        for (String key : keys) {
            me.put(key, m1.get(key));
        }
        System.out.println(me);
    }
}
