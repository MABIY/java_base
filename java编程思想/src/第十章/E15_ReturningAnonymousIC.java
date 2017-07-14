package 第十章;

/**
 * Created by lh on 17-7-14.
 * Create a class with non-default constructor
 * (one with arguments) and no default constructor
 * (no "no-arg" constructor). Create a second class
 * with a method that return a reference to
 * an object of the first class. Create the object
 * you return by making an anonymous inner
 * class inherit from the first class.
 */
class NoDefault {
    private int i;

    public NoDefault(int i) {
        this.i = i;
    }

    public void f() {
        System.out.println("Nofault.f");
    }
}

class Second {
    public NoDefault get1(int i) {
        //Doesn't override any methods:
        return new NoDefault(i);
    }

    public NoDefault get2(int i) {
        //Overrides f():
        return new NoDefault(i){
            public void f() {
                System.out.println("Second.get2.f");
            }
        };
    }
}
public class E15_ReturningAnonymousIC {
    public static void main(String[] args) {
        Second sec = new Second();
        NoDefault nd = sec.get1(47);
        nd.f();
        nd = sec.get2(47);
        nd.f();
    }
}
