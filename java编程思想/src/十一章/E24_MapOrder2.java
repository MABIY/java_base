package 十一章;

import net.mindview.util.Countries;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Created by lh on 17-7-28.
 * Fill a LinkedHashMap with String keys and objects.
 * Extract the pairs. sort them based on the keys, and
 * re-insert them into the Map.
 */
public class E24_MapOrder2 {
    public static void main(String[] args) {
        Map<String, String> m1 = new LinkedHashMap<>(Countries.capitals(25));
        System.out.print(m1);
        String[] keys = m1.keySet().toArray(new String[0]);
        Arrays.sort(keys);
        Map<String, String> m2 = new LinkedHashMap<>();
        for (String key : keys) {
            m2.put(key, m1.get(key));
        }
        System.out.println(m2);
        
    }
}
