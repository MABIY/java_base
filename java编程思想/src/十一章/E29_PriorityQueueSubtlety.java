package 十一章;

import java.util.PriorityQueue;

/**
 * Created by lh on 17-7-28.
 * Create a simple class that inherits from Object
 * and contains no members, and show that you cannot
 * successfully add multiple elements of that classs
 * to a PriorityQueue. This issue will be fully
 * explained in the Containers in depth chapter.
 */
class Dummy {

}
public class E29_PriorityQueueSubtlety {
    public static void main(String[] args) {
        PriorityQueue<Dummy> priorityQueue = new PriorityQueue<>();
        System.out.println("Adding lst instance...");
        priorityQueue.offer(new Dummy());
        System.out.println("Adding 2nd instnace...");
        priorityQueue.offer(new Dummy());
    }
}
