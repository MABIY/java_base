package 十一章;

import java.util.*;

import typeinfo.pets.*;
import typeinfo.pets.Hamster;
import typeinfo.pets.Mouse;

import static net.mindview.util.Print.print;

/**
 * Created by lh on 17-7-24.
 */
public class ListFeatures {
    public static void main(String[] args) {
        Random rand = new Random(47);
        List<Pet> pets = Pets.arrayList(7);
        print("1: " + pets);
        Hamster h = new Hamster();
        pets.add(h); //Automatically resizes
        print("2: " + pets);
        print("3: " + pets.contains(h));
        pets.remove(h); //Remove by object
        Pet p = pets.get(2);
        print("4: " + p + " " + pets.indexOf(p));
        Pet cymric = new Cymric();
        print("5: " + pets.indexOf(cymric));
        print("6: " + pets.remove(cymric));
        //Must be teh exact object:
        print("7: " + pets.remove(p));
        print("8: " + pets);
        pets.add(3,new Mouse()); //Insert at an index
        print("9：" + pets);
        List<Pet> sub = pets.subList(1, 4);
        print("subList: " + sub);
        print("10： " + pets.containsAll(sub));
        Collections.sort(sub); // In-place sort
        print("sorted subList: " + sub);
        // Order is not important in containsAll();
        print("11: " + pets.containsAll(sub));
        Collections.shuffle(sub,rand); //Mix it up
        print("shuffled subList: " + sub);
        print("12: " + pets.containsAll(sub));
        List<Pet> copy = new ArrayList<>(pets);
        sub = Arrays.asList(pets.get(1), pets.get(4));
        print("sub: " + sub);
        copy.remove(2); //Remove by index
        print("14: "+ copy );
        copy.removeAll(sub); //Only removes exact Objects
        print("15: " + copy);
        copy.set(1, new Mouse());
        print("16: " + copy);
        copy.addAll(2, sub); // Insert a list in the middle
        print("17: " + copy);
        print("18: " + pets.isEmpty());
        pets.clear(); //Remove all elements
        print("19: " + pets);
        print("20: " + pets.isEmpty());
        pets.addAll(Pets.arrayList(4));
        print("21: " + pets);
        Object[] o = pets.toArray();
        print("22: " + o[3]);
        Pet[] pa = pets.toArray(new Pet[0]);
        print("23: " + pa[3].id());
    }
}
