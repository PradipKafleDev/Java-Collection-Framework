import java.util.ArrayDeque;

public class LearnArrayDeque {
    public static void main(String[] args) {
        ArrayDeque<Integer> adq = new ArrayDeque<>();
        adq.offer(23);
        adq.offerFirst(12); // add element in first
        adq.offerLast(34); // add element in last
        adq.offer(25);

        System.out.println(adq);
        System.out.println(adq.peek()); // shows the first element
        System.out.println(adq.peekFirst()); // shows the first element
        System.out.println(adq.peekLast()); // shows the last element


        System.out.println(adq.poll()); // remove the first element
        System.out.println("Poll: "+adq);

        System.out.println(adq.pollFirst()); // remove the first element
        System.out.println("PollFirst: "+adq);

        System.out.println(adq.pollLast()); // remove the last element
        System.out.println("PollLast: "+adq);

    }
}
