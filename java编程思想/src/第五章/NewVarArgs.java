package 第五章;

/**
 * Created by lh on 17-6-22.
 */
public class NewVarArgs {
    static void printArray(Object... args) {
        for (Object obj : args) {
            System.out.println(obj+ "");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // can take individual elements
        printArray(new Integer(47), new Float(3.14), new Double(11.11));
        printArray(47,3.14F,11.11);
        printArray(new A(), new A(), new A());
        // Or an array:
        printArray((Object[]) new Integer[] {1, 2, 3, 4});
        printArray();
    }
}
