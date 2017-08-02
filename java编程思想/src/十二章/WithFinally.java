package 十二章;

/**
 * Created by lh on 17-8-2.
 */
public class WithFinally {
    static Switch sw = new Switch();

    public static void main(String[] args) {
        try {
            sw.on();
            // Code that can throw exceptions
            OnOffSwitch.f();
        } catch (OnOffException2 onOffException2) {
            System.out.println("OnOffException1");
        } catch (OnOffException1 onOffException1) {
            System.out.println("OnOffException2");
        }finally {
            sw.off();
        }
    }
}
