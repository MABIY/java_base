package 第五章.练习题答案;

/**
 * Created by lh on 17-6-22.
 */
class InitTest{
    InitTest(String s) {
        System.out.println("InitTest()");
        System.out.println(s);
    }
}
public class InitTest17 {
    public static void main(String[] args) {
        InitTest[] it = new InitTest[10];
    }
}

