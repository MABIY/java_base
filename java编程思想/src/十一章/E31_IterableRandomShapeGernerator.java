package 十一章;

import java.util.Iterator;
import java.util.Random;

/**
 * Created by lh on 17-7-30.
 * Modify polymorphism/shape/RandomShapeGernerator.java
 * to make it Iterable. You'll need to add a
 * constructor that takes the number of elements
 * that you want the iterator to produce before
 * stopping Verify that it work
 */
class RandomShapeGenerator implements Iterable<Shape> {
    private Random rand = new Random(47);
    private final int quantity;

    public RandomShapeGenerator(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public Iterator<Shape> iterator() {
        return new Iterator<Shape>() {
            private int count;

            @Override
            public boolean hasNext() {
                return count < quantity;
            }

            @Override
            public Shape next() {
                ++count;
                return nextShape();
            }
        };
    }

    private Shape nextShape() {
        switch (rand.nextInt(3)) {
            default:
            case 0:
                return new Circle();
            case 1:
                return new Square();
            case 2:
                return new Triangle();
        }
    }
}

public class E31_IterableRandomShapeGernerator {
    public static void main(String[] args) {
        RandomShapeGenerator rsg = new RandomShapeGenerator(10);
        for (Shape shape : rsg) {
            System.out.println(shape.getClass().getSimpleName());
        }


    }
}
