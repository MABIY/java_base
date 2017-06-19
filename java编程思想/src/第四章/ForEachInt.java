package 第四章;

import static net.mindview.util.Print.print;
import static net.mindview.util.Range.range;

/**
 * Created by lh on 17-6-19.
 */
public class ForEachInt {
    public static void main(String[] args) {
        for (int i : range(10)) {
            print(i + " ");
        }
        print();
        for (int i : range(5, 10)) { // 5..9
            print(i + " ");
        }
        for (int i : range(5, 21, 3)) {
            print(i  + " ");
        }
    }
}
