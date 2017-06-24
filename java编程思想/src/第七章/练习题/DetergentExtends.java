package 第七章.练习题;

import 第七章.Detergent;

/**
 * Created by lh on 17-6-24.
 */
public class DetergentExtends extends Detergent{
    @Override
    public void scrub() {
        System.out.println("Override");
    }

    public void sterilize() {
        System.out.println("new sterilize()");
    }
}
