package 十一章;

import typeinfo.pets.*;
import typeinfo.pets.Hamster;

import java.util.LinkedList;

import static net.mindview.util.Print.print;

/**
 * Created by lh on 17-7-27.
 */
public class LinkedListFeatures {
    public static void main(String[] args) {
        LinkedList<Pet> pets = new LinkedList<>(Pets.arrayList(5));
        print(pets);
        // Identical
        print("pets.getFirst(): " + pets.getFirst());
        print("pets.element(): " + pets.element());
//        only differs in empty-list behavior:
        print("pets.peek(): " + pets.peek());
//        Identical: remove and return th first element:
        print("pets.remove(): "+ pets.remove());
        print("pets.removeFirest(): " + pets.removeFirst());
        // Only differs in empty-list behavior
        print("pets.poll(): " + pets.poll());
        print(pets);
        pets.addFirst(new Rat());
        print("After addFirst(): " + pets);
        pets.offer(Pets.randomPet());
        print("After offer()" +  pets);
        pets.add(Pets.randomPet());
        print("After add(): " + pets);
        pets.addLast(new Hamster());
        print("After addLast(): " + pets);
        print("pets.removeLast(): " + pets.removeLast());
    }
}
