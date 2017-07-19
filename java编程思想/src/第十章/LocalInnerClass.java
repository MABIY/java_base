package 第十章;

import static net.mindview.util.Print.print;
import static net.mindview.util.Print.printnb;

/**
 * Created by lh on 17-7-19.
 * Holds a sequence of objects
 */
interface Counter {
    int next();
}
public class LocalInnerClass {
    private int count = 0;

    Counter getCounter(final String name) {
        //A local inner class:
        class LocalCounter implements Counter {
            @Override
            public int next() {
                printnb(name); // Access local final
                return count++;
            }
        }
        return new LocalCounter();
    }

    //The same thing with an anonymous inner class:
    Counter getCounter2(final String name) {
        return new Counter() {
            //Anonymous inner class cannot hava a named
            //Constructor, only an instance initializer
            {
                print("Counter()");
            }
            @Override
            public int next() {
                print(name); //Access local final
                return count++;
            }
        };
    }

    public static void main(String[] args) {
        LocalInnerClass lic = new LocalInnerClass();
        Counter c1 = lic.getCounter("Local inner"),
                c2 = lic.getCounter2("Anonymous inner");
        for (int i = 0; i < 5; i++) {
            print(c1.next());
        }
        for (int i = 0; i < 5; i++) {
            print(c2.next());
        }
    }
}
