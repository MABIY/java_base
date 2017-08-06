package 十三章;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by lh on 17-8-5.
 */
class InfiniteRecursionFather {
    public int a =1;
    public void f() {
        System.out.println(this);
        System.out.println(a);
    }

    @Override
    public String toString() {
        return "InfiniteRecursionFather{}";
    }
}

public class InfiniteRecursion extends InfiniteRecursionFather {
    public int a =2;
    @Override
    public String toString() {
        return "InfiniteRecursion address: " + super.toString() + "\n";
    }

    public void f() {
        System.out.println("this");
        super.f();
    }

    public static void main(String[] args) {
        List<InfiniteRecursion> v = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            v.add(new InfiniteRecursion());
            v.get(i).f();
        }
        System.out.println(v);
        System.out.println();
    }

}
