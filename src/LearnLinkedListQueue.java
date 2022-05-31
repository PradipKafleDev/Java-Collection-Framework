import java.util.LinkedList;
import java.util.Queue;

public class LearnLinkedListQueue {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(12); // offer  inserts the specified element into the queue.
        queue.offer(32);
        queue.offer(36);

        System.out.println(queue);

        System.out.println(queue.poll()); //return and remove the head of the queue
        System.out.println(queue);
        System.out.println(queue.peek()); // return the head of the queue
    }
}
