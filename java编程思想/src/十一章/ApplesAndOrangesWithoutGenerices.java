package 十一章;

import java.util.ArrayList;

/**
 * Created by lh on 17-7-23.
 * Simple container example(produces compiler warnings)
 */
class Apple {
    private static long counter;
    private final long id = counter++;
    public long id() {
        return id;
    }
}

class Orange {

}

@SuppressWarnings("unchecked")
public class ApplesAndOrangesWithoutGenerices {
    public static void main(String[] args) {
        ArrayList apples = new ArrayList();
        for (int i = 0; i < 3; i++) {
            apples.add(new Apple());
            // Not prevented from adding an orange to apples;
        }
        apples.add(new Orange());
        for (int i = 0; i < apples.size(); i++) {
            System.out.println(apples.get(i));
            // ((Apple)apples.get(i)).id();
            //Orange is detected only at run time
        }
    }
}
