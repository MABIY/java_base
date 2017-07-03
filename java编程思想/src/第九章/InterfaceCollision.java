package 第九章;

/**
 * Created by lh on 17-7-3.
 */
interface I1 {
    void f();
}
interface I2{
    int f(int i);
}

interface I3 {
    int f();
}

class C {
    public int f() {
        return 1;
    }
}

class C2 implements I1, I2 {
    @Override
    public void f() {

    }

    @Override
    public int f(int i) { //overloaded
        return 1;
    }
}

class C3 extends C implements I3 {
    public int f(int i) { //Overloaded
        return 1;
    }
}

class C4 extends C implements I3 {
    // Identical, no problem:
    public int f() {
        return 1;
    }
}

// methods differ only by return type:
//class C5 extends C implements I1 {
//}
public class InterfaceCollision {
}
