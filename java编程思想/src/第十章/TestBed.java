package 第十章;

/**
 * Created by lh on 17-7-17.
 * {main: TestBed$Tester}
 */
public class TestBed {
    public void f() {
        System.out.println("f()");
    }

    public static class Tester {
        public static void main(String[] args) {
            TestBed t = new TestBed();
            t.f();
        }

    }
}
