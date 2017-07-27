package 十一章;

import typeinfo.pets.Pet;
import typeinfo.pets.Pets;

import java.util.*;

/**
 * Created by lh on 17-7-27.
 */
public class ListIteration {
    public static void main(String[] args) {
        List<Pet> pets = Pets.arrayList(8);
        ListIterator<Pet> it = pets.listIterator();
        System.out.println(pets);
        while (it.hasNext()) {
            System.out.println(it.next() + ", " + it.nextIndex() + ", " + it.previousIndex()+"; ");
        }
        System.out.println();
        // Backward
        while (it.hasPrevious()) {
            System.out.println(it.previous().id() + " ");
        }
        System.out.println();
        System.out.println(pets);
        it = pets.listIterator(3);
        while (it.hasNext()) {
            it.next();
            it.set(Pets.randomPet());
        }
        System.out.println(pets);
    }
}
