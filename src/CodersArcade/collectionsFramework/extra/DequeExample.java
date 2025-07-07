package CodersArcade.collectionsFramework.extra;
import java.util.Deque;
import java.util.LinkedList;
public class DequeExample {
    public static void main(String[] args) {
        Deque<String> deque = new LinkedList<>();
        // Stack Behaviour
        deque.push("One"); // [One]
        deque.push("Two"); // [Two, One]
        deque.push("Three"); // [Three, Two, One]
        System.out.println(deque.pop());

        // Queue Behaviour
        deque.add("A"); // [Two, One, A]
        deque.add("B"); // [Two, One, A, B]
        System.out.println(deque.remove());

    }
}
