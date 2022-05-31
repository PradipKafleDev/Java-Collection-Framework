import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class LearnPriorityQueue {
    public static void main(String[] args) {

        Queue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
        pq.offer(12);
        pq.offer(5);
        pq.offer(7);
        pq.offer(9);
        System.out.println(pq);
        pq.poll();
        System.out.println(pq);

    }
}
