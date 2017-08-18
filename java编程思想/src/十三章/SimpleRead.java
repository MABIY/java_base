package 十三章;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.StringReader;

/**
 * Created by lh on 17-8-16.
 */
public class SimpleRead {
    public static BufferedReader input = new BufferedReader(
            new StringReader("Sir Robin of Camelot\n22 1.61803")
    );

    public static void main(String[] args) {
        try {
            System.out.println("What is your name?");
            String name = input.readLine();
            System.out.println(name);
            System.out.println("How old ary you? What is your favorite double?");
            System.out.println("(input: <age>)");
            String numbers = input.readLine();
            System.out.println(numbers);
            String[] numArray = numbers.split(" ");
            int age = Integer.parseInt(numArray[0]);
            double favorite = Double.parseDouble(numArray[1]);
            System.out.printf("Hi %s.\n", name);
            System.out.format("My favorite douhle is %f.", favorite / 2);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
