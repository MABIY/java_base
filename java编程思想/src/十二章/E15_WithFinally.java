package 十二章;

/**
 * Created by lh on 17-8-2.
 * Show that Withfinally.java doesn't fail by
 * throwing a runtimeException inside the try
 * block
 */
public class E15_WithFinally {
    static Switch sw = new Switch();
    static void f() throws OnOffException2,OnOffException1{
        throw new RuntimeException("Inside try");
    }

    public static void main(String[] args) {
        try {
            try {
                sw.on();
                //Code that can throw exceptions...
                f();
            } catch (OnOffException2 onOffException2) {
                onOffException2.printStackTrace();
            } catch (OnOffException1 onOffException1) {
                onOffException1.printStackTrace();
            } finally {
                sw.off();
            }
        } catch (RuntimeException e) {
            System.out.println("Exception '" + e+"'.Iid the switch" +
                    "get turned off?");
            System.out.println(sw);
        }
    }
}
