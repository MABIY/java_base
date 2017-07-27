package net.mindview.util;

/**
 * Created by lh on 17-7-27.
 * Stacks are often used to evaluate expressions
 * in programming languages. Using
 * net.mindview.util.Stack.evaluate the follwing
 * expression ,where '+'means "push the floowing letter onto the stack,"
 * and '-' means "pop" the top of the stack and print it“：
 */
public class E15_Evaluator {
    private final static Stack<Character> stack = new Stack<>();

    private static void evaluate(String expr) {
        char data[] = expr.toCharArray();
        for (int i = 0; i < data.length;) {
            switch (data[i++]) {
                case '+' :
                    stack.push(data[i++]);
                    break;
                case '-':
                    System.out.println(stack.pop());
            }
        }
    }

    public static void main(String[] args) {
        evaluate("+U+n+c---+e+r+t---+a-+i-+n+t+y---+ -+r+u--+l+e+s---");
    }
}