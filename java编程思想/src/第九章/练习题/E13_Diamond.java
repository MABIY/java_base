package 第九章.练习题;

/**
 * Created by lh on 17-7-3.
 * Create an interface , inherit two new
 * interfaces from it , then multiply-inherit
 * a third interface from the second two.
 */

interface BaseInterface {
    void f();
}

interface IntermediateInterface1 extends BaseInterface {
    void f();
}


interface IntermediateInterface2 extends BaseInterface {
    void f();
}

interface CombinedInterface extends IntermediateInterface1, IntermediateInterface2 {
    void f();
}

class CombinedImple implements CombinedInterface {
    @Override
    public void f() {
        System.out.println("CombinedTmpl.f()");
    }
}

public class E13_Diamond {
    public static void main(String[] args) {
        new CombinedImple().f();
    }
}
