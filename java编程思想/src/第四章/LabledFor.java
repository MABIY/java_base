package 第四章;

import static net.mindview.util.Print.print;

/**
 * Created by lh on 17-6-19.
 */
public class LabledFor {
    public static void main(String[] args) {
        int i = 0;
        outer: // Can't hava statements here
        for (int j =0;true;j++) {
            System.out.println("-------------- 111          --------------------------"+ j);
            for (; true; ) {
                inner:
                //Can't have statements here
                for (; i < 10; i++) {
                    print("i =  " + i);
                    if (i == 2) {
                        print("continue");
                        continue;
                    }
                    if (i == 3) {
                        print("break")/**/;
                        i++;
                        break;
                    }
                    if (i == 7) {
                        print("contine outer");
                        i++; //Otherwise i never
                        // gets incremented
                        continue outer;
                    }
                    if (i == 8) {
                        print("break outer");
                        break outer;
                    }

                    for (int k = 0; k < 5; k++) {
                        if (k == 3) {
                            print("continue inner");
                            continue inner;
                        }
                    }

                }

            }
        }
    }
}
