package 第二章.练习题;

/**
 * Created by lh on 17-5-25.
 */
class Tree {
    int height;
    Tree() {
        System.out.println("Planting a seeding");
        height = 0;
    }

    Tree(int initialHeight) {
        height = initialHeight;
        System.out.println("Creating new tree that is" + height + " feet tall");
    }

    void info() {
        System.out.println("Tree is " + height + " feet tall");
    }

    void info(String s) {
        System.out.println(s + ": Tree is " + height + " feet tall");
    }
}
public class Practice_15 {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            Tree t = new Tree(i);
            t.info();
            t.info("overloading method");
        }
        new Tree();
    }
}
