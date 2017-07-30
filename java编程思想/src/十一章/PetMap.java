package 十一章;

import typeinfo.pets.Cat;
import typeinfo.pets.Dog;
import typeinfo.pets.Hamster;
import typeinfo.pets.Pet;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static net.mindview.util.Print.print;

/**
 * Created by lh on 17-7-27.
 */
public class PetMap {
    public static void main(String[] args) {
        Map<String, Pet> petMap = new HashMap<>();
        petMap.put("My Cat", new Cat("Molly"));
        petMap.put("My Dog",new Dog("GInger"));
        petMap.put("My Hamster",new Hamster("Bosco"));
        print(petMap);
        Pet dog = petMap.get("My Dog");
        print(dog);
        print(petMap.containsKey("My Dog"));
        print(petMap.containsValue(dog));

        Map<List<String>, List<String>> a = new HashMap<>();
        a.put(Arrays.<String>asList("a","b"),Arrays.asList("c","d"));
        System.out.println("a map(List<String>,List<String>)"+ a);

    }
}
