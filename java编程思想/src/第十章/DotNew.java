package 第十章;

/**
 * Created by lh on 17-7-11.
 * Creating an inner class directory using the .new Syntax
 */
public class DotNew {
    public class Inner {

    }

    public static void main(String[] args) {
        DotNew dn = new DotNew();
        DotNew.Inner dni = dn.new Inner();
        System.out.println(dni);
    }
}
