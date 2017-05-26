package 第二章.练习题答案;

/**
 * Created by lh on 17-5-24.
 */
public class Practice_6 {
    public static void main(String[] args) {
        class StoreStuff {
            int storage(String s) {
                return s.length() * 2;
            }
        }
        StoreStuff x = new StoreStuff();
        System.out.println(x.storage("hi"));
    }
}
