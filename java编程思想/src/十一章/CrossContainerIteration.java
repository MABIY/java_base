package 十一章;

import typeinfo.pets.Pet;
import typeinfo.pets.Pets;

import java.util.*;

/**
 * Created by lh on 17-7-26.
 */
public class CrossContainerIteration {
    public static void display(Iterator<Pet> iterator) {

        while (iterator.hasNext()) {
            Pet pe = iterator.next();
            System.out.println(pe.id() + ":" + pe + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        ArrayList<Pet> pets = Pets.arrayList(8);
        LinkedList<Pet> petsLL = new LinkedList<>(pets);
        HashSet<Pet> petsHS = new HashSet<>(pets);
        TreeSet<Pet> petsTS = new TreeSet<>(pets);
        display(pets.iterator());
        display(petsLL.iterator());
        display(petsHS.iterator());
        display(petsTS.iterator());
    }
}
