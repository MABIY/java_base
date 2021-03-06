package 第四章;

import static net.mindview.util.Range.range;

/**
 * Created by lh on 17-6-19.
 */
public class BreakAndContinue {
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            if (i == 74) {
                break;
            }
            if (i % 9 != 0) {
                continue; // Next iteration
            }
            System.out.println(i + " ");
        }
        System.out.println();
        // Using foreach
        for (int i : range(100)) {
            if(i ==74) break;
            if( i% 9 != 0) continue; // Next iteration
            System.out.println(i + " ");
        }
        System.out.println();
        int i = 0;
        // An "infinite loop":
        while (true) {
            i++;
            int j = i * 27;
            if (j == 1269) {
                break;
            }
            if (i % 10 != 0) {
                continue;
            }
            System.out.println(i + " ");
        }
    }
}
