package 十二章;

/**
 * Created by lh on 17-8-2.
 * Repeat the previous exercise,but inside the catch clause,
 * wrap g()'s exception in a RuntimeException
 */
class AnException2 extends Exception {

}
public class E11_ChangeToRunTimeException {
    public void g() throws AnException2 {
        throw new AnException2();
    }
    public void f() {
        try {
            g();
        } catch (AnException2 anException2) {
            throw new RuntimeException(anException2);
        }
    }

    public static void main(String[] args) {
        E11_ChangeToRunTimeException ce = new E11_ChangeToRunTimeException();
        ce.f();
    }
}
