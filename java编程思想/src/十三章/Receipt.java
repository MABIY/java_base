package 十三章;

import java.util.Formatter;

/**
 * Created by lh on 17-8-6.
 */
public class Receipt {
    private double total = 0;
    private Formatter f = new Formatter(System.out);
    public void printTitle() {
        f.format("%-15s %5s %10s\n", "Item", "Qty", "Price");
        f.format("%-15s %5s %10s\n", "----", "----", "----");
    }

    public void print(String name, int qty, double price) {
        f.format("%-15.15s %5s %10s\n", name, qty, price);
    }

    public void printTotal() {
        f.format("%-15s %5s %10.2f\n", "Tax", "", total * 0.06);
        f.format("%-15s %5s %10s\n", "", "", "-----");
        f.format("%-15s %5s %10.2f\n", "Toatl", "", total * 1.06);
    }

    public static void main(String[] args) {
        Receipt receipt = new Receipt();
        receipt.printTitle();
        receipt.print("Jack's Magic Be", 4, 4.25);
        receipt.print("Princess Peas", 3, 5.1);
        receipt.printTotal();
    }
}
