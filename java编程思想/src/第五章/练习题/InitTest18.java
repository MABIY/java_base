package 第五章.练习题;

/**
 * Created by lh on 17-6-22.
 */
class InitTest1 {
    InitTest1(String s) {
        System.out.println("InitTest()");
        System.out.println(s);
    }
}

public class InitTest18 {
    public static void main(String[] args) {
        InitTest1[] it = new InitTest1[5];
        for (int i = 0; i < it.length; i++) {
            it[i] = new InitTest1(Integer.toString(i));
        }
    }
}



