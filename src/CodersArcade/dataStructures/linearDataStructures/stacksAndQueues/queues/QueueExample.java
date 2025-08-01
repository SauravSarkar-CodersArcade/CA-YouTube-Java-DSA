package CodersArcade.dataStructures.linearDataStructures.stacksAndQueues.queues;
import java.util.LinkedList;
import java.util.Queue;
public class QueueExample {
    public static void main(String[] args) {
        Queue<Integer> numbers = new LinkedList<>();
        numbers.offer(1);
        numbers.offer(2);
        numbers.offer(3);
        System.out.println("Queue: " + numbers);
        numbers.poll();
        System.out.println("Queue after poll: " + numbers);
        System.out.println("Front: " + numbers.peek());
    }
}
