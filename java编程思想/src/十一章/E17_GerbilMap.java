package 十一章;

import java.util.HashMap;
import java.util.*;
import java.util.Map.Entry;


/**
 * Created by lh on 17-7-27.
 * Move the Gerbil class from Exercise 1
 * into a Map, and associate each gerbil (the value)
 * with it's name as a String (the key).
 * Use an Iterator for the keySet() to move
 * though the Map, look up the Gerbil for each key,
 * print out the key, and tell the gerbil to hop()
 */
public class E17_GerbilMap {
    public static void main(String[] args) {
        Map<String, Gerbil> map = new HashMap<String, Gerbil>();
        map.put("Fuzzy",new Gerbil(1));
        map.put("Sppt", new Gerbil(3));
        map.put("Joe", new Gerbil(4));
        map.put("Ted", new Gerbil(5));
        Iterator<Entry<String, Gerbil>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Entry<String,Gerbil> entry = it.next();
            System.out.println(entry.getKey() + ": ");
            entry.getValue().hop();
        }
    }
}
