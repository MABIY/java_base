package 十二章;

/**
 * Created by lh on 17-8-2.
 * Show that OnOffSwitch.java can fail by
 * throwing a runtimeException inside the try block.
 */
public class E14_OnOffSwitch {
    static Switch sw = new Switch();

    static void f() throws OnOffException1,OnOffException2{
        throw new RuntimeException("Inside try");
    }

    public static void main(String[] args) {
        try {
            try {
                sw.on();
                //Code that can throw exceptions
                f();
                sw.on();
            } catch (OnOffException2 onOffException2) {
                System.out.println("OnOffException1");
                sw.off();
            } catch (OnOffException1 onOffException1) {
                System.out.println("OnOffException2");
                sw.off();
            }
        } catch (RuntimeException e) {
            System.out.println(sw);
            System.out.println("Oops! the exceptions'"+e+"' slipped throught without thrning the switch off!" );
        }
    }
}
