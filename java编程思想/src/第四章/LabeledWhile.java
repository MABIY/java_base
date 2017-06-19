package 第四章;

import static net.mindview.util.Print.print;

/**
 * Created by lh on 17-6-19.
 */
public class LabeledWhile {
    public static void main(String[] args) {
        int i = 0 ;
        outer:
        while (true) {
            print("Outer while loop");
            while (true) {
                i++;
                print("i = " + i);
                if (i == 1) {
                    print("continue");
                    continue;
                }
                if (i == 3) {
                    print("cotinue outher");
                    continue outer;
                }
                if (i == 5) {
                    print("break");
                    break ;
                }
                if (i == 7) {
                    print("break outer");
                    break outer;
                }

            }
        }
    }
}
