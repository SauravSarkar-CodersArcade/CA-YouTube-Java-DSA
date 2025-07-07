package CodersArcade.collectionsFramework;
import java.util.LinkedList;
import java.util.Queue;
public class QueueExample {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>(); // FIFO
        // 2 3
        queue.offer(2);
        queue.offer(3);
        System.out.println(queue);
        queue.poll();
        System.out.println(queue);
        queue.offer(4);
        System.out.println(queue);
        queue.poll();
        System.out.println(queue);
    }
}
