import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueConcepts {

    public static void main(String[] args) {

        // lowest value will be given most priority
        Queue<Integer> priorityQueue = new PriorityQueue<>();

        priorityQueue.offer(30);
        priorityQueue.offer(10);
        priorityQueue.offer(20);

        System.out.println(priorityQueue.peek());

        priorityQueue.poll();
        System.out.println(priorityQueue.peek());
        System.out.println("\n");

        // lowest value will be given most priority
        Queue<Integer> priorityQueue2 = new PriorityQueue<>(Collections.reverseOrder());

        priorityQueue2.offer(30);
        priorityQueue2.offer(10);
        priorityQueue2.offer(20);

        System.out.println(priorityQueue2.peek());

        priorityQueue2.poll();
        System.out.println(priorityQueue2.peek());
    }
}
