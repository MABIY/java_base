package 第十章;

/**
 * Created by lh on 17-7-19.
 * Inheriting an inner class
 */
class WithInner{
    class Inner {

    }
}

public class InheritInner extends WithInner.Inner{
    InheritInner(WithInner withInner) {
       withInner.super();
    }

    public static void main(String[] args) {
        WithInner wi = new WithInner();
        InheritInner ii = new InheritInner(wi);
    }
}
