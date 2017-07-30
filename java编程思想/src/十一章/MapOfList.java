package 十一章;

import typeinfo.pets.*;

import java.util.*;

import static net.mindview.util.Print.print;

/**
 * Created by lh on 17-7-27.
 */
public class MapOfList {
    public static Map<Person,List<? extends Pet>> petPeople = new HashMap<>();
    static {
        petPeople.put(new Person("Dawn"), Arrays.asList(new Cymric("Molly"),new Mutt("Soot")));
        petPeople.put(new Person("Kate"), Arrays.asList(new Cat("Shackleton"),new Dog("Margrett")));
        petPeople.put(new Person("Marilyn"), Arrays.asList(new Pug("Louie aka Louis Snorkelstein Dupress"),
                new Cat("Stanford aka stinkey el Negro"),
                new Cat("Pinkola")));
        petPeople.put(new Person("Luke"),Arrays.asList(new Rat("Fuzzy"),
                new Rat("Fizzy")));
        petPeople.put(new Person("Issac"),Arrays.asList(new Rat("Freckly")));
    }

    public static void main(String[] args) {
        print("People: " + petPeople.keySet());
        print("Pets: " + petPeople.values());
        for (Person person : petPeople.keySet()) {
            print(person + " has: ");
            for (Pet pet : petPeople.get(person)) {
                print("  " + pet);
            }
        }

        System.out.println(new LinkedList<>(Arrays.asList(2,3)));
    }
}
