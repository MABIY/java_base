package 第十章;

import static net.mindview.util.Print.print;

/**
 * Created by lh on 17-7-18.
 * Using inner classes for callbacks
 */
interface Incrementable {
   void increment();
}

// Very simple to implement the interface
class Callee1 implements Incrementable {
   private int i;
   @Override
   public void increment() {
      i++;
      print(i);
   }
}

class MyIncrement{
   public void increment() {
      print("Other operation");
   }

   static void f(MyIncrement mi) {
      mi.increment();
   }
}

//if your class must implement increment() in
// some other way.you must use an inner class:
class Callee2 extends MyIncrement {
   private int i ;

   @Override
   public void increment() {
       super.increment();
       i++;
       print(i);
   }

   private class Closure implements Incrementable {
      @Override
      public void increment() {
         // Specify outer-class method,otherwise
         //you'd get an infinite recursion
         Callee2.this.increment();
      }
   }

   Incrementable getCallBackReference() {
      return new Closure();
   }
}

class Caller {
   private Incrementable callbackReference;

   Caller(Incrementable cbh) {
      callbackReference = cbh;
   }
   void go() {
      callbackReference.increment();
   }
}

public class Callbacks {
   public static void main(String[] args) {
      Callee1 c1 = new Callee1();
      Callee2 c2 = new Callee2();
      MyIncrement.f(c2);
      Caller caller1 = new Caller(c1);
      Caller caller2 = new Caller(c2.getCallBackReference());
      caller1.go();
      caller1.go();
      caller2.go();
      caller2.go();

   }
}
