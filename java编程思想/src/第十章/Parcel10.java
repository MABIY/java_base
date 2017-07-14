package 第十章;

import 第二章.练习题.Practice_10;

import java.util.Map;

/**
 * Created by lh on 17-7-14.
 * using "instance initialization" to perform
 * construction on an anonymous inner class.
 */
public class Parcel10 {
    public Destination destination(final String dest, final float price) {
        return new Destination() {
            private int cost;

            // Instance initalization for each object
            {
                cost = Math.round(price);
                if (cost > 100) {
                    System.out.println("Over budget");
                }
            }

            private String label = dest;

            @Override
            public String readLabel() {
                return label;
            }
        };
    }

    public static void main(String[] args) {
        Parcel10 p = new Parcel10();
        Destination d = p.destination("Tansmania", 101.395F);
    }
}
