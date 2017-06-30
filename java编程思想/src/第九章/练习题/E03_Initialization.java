package 第九章.练习题;

/**
 * Created by lh on 17-6-30.
 * Create a base class with an abstract print()
 * method that is overriden in a derived class.
 * The overridden version of the method prints
 * the value of an int variable defined in the
 * derived class. Define this variable with a
 * nonzero  value . Call print() in th
 * base-class constructor . Create an object of
 * the derived type in main(), then call its
 * print() method. Explain the results
 */
abstract class BaseWithPrint {
    public BaseWithPrint() {
        print();
    }

    protected abstract void print();

}

class Test extends BaseWithPrint {
    private int i = 10;

    public Test() {
       print();
    }
    @Override
    protected void print() {
        System.out.println("g = g" + i);
    }
}
class DerivedWithPrint extends Test {
    private int i = 47;

    @Override
    protected void print() {
        System.out.println("i = i " + i);
    }

}
public class E03_Initialization{
    public static void main(String[] args) {
        DerivedWithPrint dp = new DerivedWithPrint();
        dp.print();
    }
}

