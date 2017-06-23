package 第五章.练习题;

/**
 * Created by lh on 17-6-21.
 */
class Kabayo2 {
    Kabayo2() {
        System.out.println("is a long kabayo");
    }

    Kabayo2(String s) {
        System.out.println(s);
    }
}
public class DefaultConstructorTest2 {
    public static void main(String[] args) {
        Kabayo2 k = new Kabayo2();
        Kabayo2 k2 = new Kabayo2("tumutugtog ng gitara");
    }
}
