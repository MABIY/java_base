package 十一章;

import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Random;

/**
 * Created by lh on 17-7-28.
 * fill a PriorityQueue (using offer()) with
 * Double
 */
public class E28_PriorityQueue {
    static Random rand = new Random(47);

    public static void printQ(Queue<?> queue) {
        for (Object data = queue.poll() ; data !=null ;data = queue.poll()) {
            System.out.println(data + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        PriorityQueue<Double> priorityQueue = new PriorityQueue<>();
        for (int i = 0; i < 10; i++) {
            priorityQueue.offer(rand.nextDouble());
        }
        printQ(priorityQueue);
    }
}
