package 十三章;

import generics.coffee.Coffee;
import generics.coffee.CoffeeGenerator;

import java.util.ArrayList;

/**
 * Created by lh on 17-8-5.
 */
public class ArrayListDisplay {
    public static void main(String[] args) {
        ArrayList<Coffee> coffees = new ArrayList<>();
        for (Coffee c : new CoffeeGenerator(10)) {
            coffees.add(c);
        }
        System.out.println(coffees);
    }
}
