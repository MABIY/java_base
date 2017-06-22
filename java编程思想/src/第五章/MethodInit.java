package 第五章;

/**
 * Created by lh on 17-6-22.
 */
public class MethodInit {
    int i = f();
    int j = g(i);

    private int g(int i) {
        return i * 10;
    }

    private int f() {
        return 11;
    }
}
