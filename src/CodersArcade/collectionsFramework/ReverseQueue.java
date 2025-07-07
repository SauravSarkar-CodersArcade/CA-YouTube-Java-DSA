package CodersArcade.collectionsFramework;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
public class ReverseQueue {
    public static void reverseQueue(Queue<Integer> queue){
        Stack<Integer> stack = new Stack<>();
        // Step 1: Remove elements from the queue & insert into stack
        while (!queue.isEmpty()){
            stack.push(queue.poll());
        }
        // Step 2: Remove elements from stack & add to the queue
        while (!stack.isEmpty()){
            queue.offer(stack.pop());
        }
    }
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(10);
        queue.add(20);
        queue.add(30);
        queue.add(40);
        reverseQueue(queue);
        System.out.println(queue);
    }
}
