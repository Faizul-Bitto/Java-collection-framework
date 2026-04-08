import java.util.LinkedList;
import java.util.Queue;

public class QueueConcepts {

    public static void main(String[] args) {

        Queue<Integer> queue = new LinkedList<>();

        queue.offer(10);
        queue.offer(20);
        queue.offer(30);
        queue.offer(40);

        queue.poll();
        queue.remove();

        System.out.println(queue.peek());

        for (Integer q : queue) {
            System.out.print(q + " ");
        }
    }

}