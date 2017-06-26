package 第八章;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by lh on 17-6-26.
 */
class Useful {
    public void f() {

    }
    public void g() {

    }
}

class MoreUseful extends Useful {
    public void f() {

    }
    public void g() {

    }
    public void u() {

    }
    public void v() {

    }
    public void w() {

    }
}
public class RTTI {
    public static void main(String[] args) {
        SimpleDateFormat sdf = new SimpleDateFormat("YYYYMMddHHmmssSSS");
        System.out.println(new Date());
       Useful[] x = {new Useful(),new MoreUseful(),};
       x[0].f();
       x[1].g();
//       x[1].u();
        ((MoreUseful) x[1]).u(); //Downcast/RTTI
        ((MoreUseful)x[0]).u(); //Exception thrown
    }
}
