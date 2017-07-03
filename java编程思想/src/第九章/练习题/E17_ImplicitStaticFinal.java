package 第九章.练习题;

/**
 * Created by lh on 17-7-3.
 * Prove that the fields in an interface are
 * implicitly static and final.
 */

interface StaticFinalTest {
     String RED = "Red";
}

class Test1 implements StaticFinalTest {
     public Test1() {
         // Compile-time error: cannot assign a value
          // to final variable RED:
//          RED = "Blue";
     }
}
public class E17_ImplicitStaticFinal {
     public static void main(String[] args) {
          //Accessing as a static field:
          System.out.println("StaticFinalTest.RED = " +
          StaticFinalTest.RED);
     }
}
