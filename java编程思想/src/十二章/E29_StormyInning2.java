package 十二章;

/**
 * Created by lh on 17-8-2.
 * ********************Exercise 29********************
 * Modify all the exception types in stormyInning.java
 * so that they extend runtimeException, and show
 * that no exception specifications or try blocks are
 * necessary.Remove the "//! comment and show how
 * the methods can be compiled without specifications
 * ****************************************
 */
class BaseBallException2 extends RuntimeException {
}

class Foul2 extends BaseBallException2 {
}

class Strike2 extends BaseBallException2 {
}

abstract class Inning2 {
    Inning2() {
    }
    public void event() {
    }

    abstract void atBat();

    void walk() {
    }
}

class StormExeption2 extends RuntimeException {
}

class RainedOut2 extends StormExeption2 {
}

class PopFoul2 extends Foul2 {
}

interface Storm2 {
    void event();

    void rainHard();
}

class StormyInning2 extends Inning2 implements Storm2 {
    @Override
    void atBat() {
        throw new PopFoul2();
    }

    @Override
    public void rainHard() {
    }

    StormyInning2() {

    }

    StormyInning2(String s) {
    }
}








































































public class E29_StormyInning2 {
    public static void main(String[] args) {
        StormyInning2 si = new StormyInning2();
        si.atBat();
    }
}
