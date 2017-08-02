package 十二章;

/**
 * Created by lh on 17-8-2.
 * Modify reusing/CADSystem.java to demonstrate
 * that returning from the middle of a try-finally
 * will still perform proper cleanup
 */
public class E16_CADSystem {
    public static void main(String[] args) {
        CADSystem x = new CADSystem(47);
        try {
            return;
        }finally {
            x.dispose();
        }
    }
}
