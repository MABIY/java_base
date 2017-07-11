package 第十章;

/**
 * Created by lh on 17-7-11.
 * modify Exercise 1 so Outer has a private
 * String field (initialized by the constructor).
 * and Inner has a toString() that displays this
 * field. Create an object of type Inner and
 * display id.
 */
class Outer2 {
    private String data;
    class Inner {
        {
            System.out.println("Inner created");
        }

        @Override
        public String toString() {
            return data;
        }
    }

    public Outer2(String data) {
        this.data = data;
    }

    Inner getInner() {
        return new Inner();
    }
}
public class E03_InnerAccessingOuter {
    public static void main(String[] args) {
        Outer2 outer2 = new Outer2("initialize");
        Outer2.Inner i = outer2.getInner();
        System.out.println(i.toString());
    }
}
