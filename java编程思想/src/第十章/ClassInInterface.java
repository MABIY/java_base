package 第十章;

/**
 * Created by lh on 17-7-17.
 * {main: ClassInInterface$Test}
 */
public interface ClassInInterface {
   public void howdy();

   class Test implements ClassInInterface {
      @Override
      public void howdy() {
         System.out.println("Howdy!");
      }

      public static void main(String[] args) {
         new Test().howdy();
      }
   }
}
