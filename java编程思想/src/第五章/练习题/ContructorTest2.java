package 第五章.练习题;

/**
 * Created by lh on 17-6-20.
 */
class Tester2 {
    String s1;
    String s2 = "hello";
    Tester2() {
        System.out.println(s3);
        s3 = "good-bye";
    }

    String s3 ="ffff";
}
public class ContructorTest2 {
    public static void main(String[] args) {
        Tester2 t = new Tester2();
        System.out.println("t.s1" + t.s1);
        System.out.println("t.s2" + t.s2);
        System.out.println("t.s3" + t.s3);
    }
}
