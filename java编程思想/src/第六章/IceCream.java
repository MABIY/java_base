package 第六章;

import sun.security.provider.Sun;

/**
 * Created by lh on 17-6-23.
 */
class Sundae {
        private Sundae() { }

        static Sundae makeASundae() {
                                          return new Sundae();
                                                              }
    }
    public class IceCream {
    public static void main(String[] args) {
//        Sundae x = new Sundae();
        Sundae x = Sundae.makeASundae();
    }
}
