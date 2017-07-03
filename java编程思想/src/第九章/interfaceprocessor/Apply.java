package 第九章.interfaceprocessor;

import static net.mindview.util.Print.print;

/**
 * Created by lh on 17-7-3.
 */
public class Apply {
    public static void process(Processor p, Object s) {
        print("Using Processor " + p.name());
        print(p.process(s));
    }
}
