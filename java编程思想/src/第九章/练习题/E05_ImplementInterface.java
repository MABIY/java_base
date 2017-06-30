package 第九章.练习题;

import 第九章.练习题.ownpackage.AnInterface;

import static net.mindview.util.Print.print;

/**
 * Created by lh on 17-6-30.
 * Create an interface with three methods in its own package.
 * implement the interface in a
 * different package
 */
class ImplementInterface implements AnInterface {
    @Override
    public void f() {
        print("ImplementInterface.f");
    }

    @Override
    public void g() {
        print("ImplementInterface.g");
    }

    @Override
    public void h() {
        print("ImplementInterface.h");
    }
}
public class E05_ImplementInterface {
    public static void main(String[] args) {
        ImplementInterface imp = new ImplementInterface();
        imp.f();
        imp.g();
        imp.h();
    }
}
