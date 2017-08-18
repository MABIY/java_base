package 十三章;

import com.sun.org.apache.xerces.internal.impl.xs.SchemaNamespaceSupport;

import java.util.Scanner;

/**
 * Created by lh on 17-8-16.
 */
public class BetterRead {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(SimpleRead.input);
        System.out.println("What is your name?");
        String name = stdin.nextLine();
        System.out.println();
        System.out.println(
                "How old ary you? What is your favorite douhle?"
        );
        System.out.println("(input: <age> <double>)");
        int age = stdin.nextInt();
        double favorite = stdin.nextDouble();
        System.out.println(age);
        System.out.println(favorite);
        System.out.format("Hi %s .\n", name);
        System.out.printf("In 5 years you will be %d.\n",age+5);
        System.out.format("My favorite double is %f.", favorite / 2);
    }
}
