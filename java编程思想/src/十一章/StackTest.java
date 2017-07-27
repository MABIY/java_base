package 十一章;

/**
 * Created by lh on 17-7-27.
 */
public class StackTest {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        for (String s : "My dog has fleas".split(" ")) {
            stack.push(s);
        }
        while (!stack.empty()) {
            System.out.println(stack.pop() + " ");
        }
    }
}
