package 十一章;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by lh on 17-7-28.
 * Write a class called Command that contains a
 * String and has a method operation() that
 * displays the String. Wirte a second class with
 * a method that fills a Queue with Command objects
 * and returns it .Pass the filled Queue to a method
 * in a third class that consumes the objects in the
 * Queue and calls their operation() methods
 */
class Command {
    private final String cmd;

    Command(String cmd) {
        this.cmd = cmd;
    }

    public void operation() {
        System.out.println(cmd);
    }
}

class Producer {
    public static void produced(Queue<Command> q) {
        q.offer(new Command("load"));
        q.offer(new Command("delete"));
        q.offer(new Command("save"));
        q.offer(new Command("exit"));
    }
}

class Consumer {
    public static void consume(Queue<Command> queue) {
        while (queue.peek() != null) {
            queue.remove().operation();
        }
    }
}

public class E27_CommandQueue {
    public static void main(String[] args) {
        Queue<Command> cmds = new LinkedList<>();
        Producer.produced(cmds);
        Consumer.consume(cmds);

    }
}
