package 十一章;

import java.util.ArrayList;

/**
 * Created by lh on 17-7-23.
 */
class GrannySmith extends Apple {

}

class Gala extends Apple {

}

class Fuji extends Apple {

}

class Braeburn extends Apple {

}
public class GenericsAndUpcasting {
    public static void main(String[] args) {
        ArrayList<Apple> apples = new ArrayList<>();
        apples.add(new GrannySmith());
        apples.add(new Gala());
        apples.add(new Fuji());
        apples.add(new Braeburn());
        for(Apple c : apples) {
            System.out.println(c);
        }
    }
}
