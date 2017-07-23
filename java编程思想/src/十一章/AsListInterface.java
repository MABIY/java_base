package 十一章;

import java.util.Arrays;
import java.util.List;

/**
 * Created by lh on 17-7-23.
 * Arrays.asList() makes its best guess about type
 */
class Snow{}
class Powder extends Snow{}
class Light extends Powder{}
class Heavy extends Powder{}
class Crusty extends Snow{}
class Slush extends Snow{}

public class AsListInterface {
    public static void main(String[] args) {
        List<Snow> snow1 = Arrays.asList(new Light(),new Heavy());
        List<Snow> snow2 = Arrays.asList(new Light(), new Heavy());
    }
}
