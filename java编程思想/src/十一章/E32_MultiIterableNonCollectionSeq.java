package 十一章;

import typeinfo.pets.Pet;

import java.util.*;

/**
 * Created by lh on 17-7-30.
 * Following the example of MultiIterableClass,
 * add reversed() and randomized() methods to
 * NonCollectionSequence.java, as well as making
 * NonCollectionSequence implement Iterable, and
 * show that all approaches work in foreach
 * statements
 */
class NonCollectionSequence extends PetSequence implements Iterable<Pet> {

    public Iterable<Pet> reversed() {
        return new Iterable<Pet>() {
            @Override
            public Iterator<Pet> iterator() {
                return new Iterator<Pet>() {
                    int current = pets.length - 1;

                    @Override
                    public boolean hasNext() {
                        return current > -1;
                    }

                    @Override
                    public Pet next() {
                        return pets[current--];
                    }
                };
            }
        };
    }
    @Override
    public Iterator<Pet> iterator() {
        return new Iterator<Pet>() {
            private int index = 0;

            @Override
            public boolean hasNext() {
                return index < pets.length;
            }

            @Override
            public Pet next() {
                return pets[index++];
            }
        };
    }

    public Iterable<Pet> randomized() {
        return new Iterable<Pet>() {
            @Override
            public Iterator<Pet> iterator() {
                List<Pet> shuffled = new ArrayList<Pet>(Arrays.asList(pets));
                Collections.shuffle(shuffled, new Random(47));
                return shuffled.iterator();
            }
        };
    }
}
public class E32_MultiIterableNonCollectionSeq {
    public static void main(String[] args) {
        NonCollectionSequence nc = new NonCollectionSequence();
        for (Pet pet : nc) {
            System.out.print(pet + " ");
        }
        System.out.println();
        for (Pet pet : nc.randomized()) {
            System.out.print(pet + " ");
        }
        System.out.println();
        for (Pet pet : nc.reversed()) {
            System.out.print(pet + " ");
        }
    }
}
