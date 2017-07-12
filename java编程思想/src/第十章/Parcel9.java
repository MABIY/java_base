package 第十章;

/**
 * Created by lh on 17-7-12.
 * An anonymous inner class that performs
 * initialization.A briefer version of parcel5.java
 */
public class Parcel9 {
    // Argument must be final to use inside
    // anonymous inner class:
    private String a;
    public Destination destination(String dest) {
        return new Destination() {
            private String label = a;
            public String readLabel() { return label; }
        };
    }
    public static void main(String[] args) {
        Parcel9 p = new Parcel9();
        Destination d = p.destination("Tasmania");
    }
} ///:~

