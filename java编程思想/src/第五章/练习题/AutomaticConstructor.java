package 第五章.练习题;

/**
 * Created by lh on 17-6-21.
 */
class Aso {
    void bark() {
        System.out.println("woof");
    }
}
public class AutomaticConstructor {
    public static void main(String[] args) {
        Aso a = new Aso();
        a.bark();
    }
}
