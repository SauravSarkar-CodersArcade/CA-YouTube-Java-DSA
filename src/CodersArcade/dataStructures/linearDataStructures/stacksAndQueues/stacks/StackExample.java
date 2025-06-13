package CodersArcade.dataStructures.linearDataStructures.stacksAndQueues.stacks;
import java.util.Stack;
public class StackExample {
    public static void main(String[] args) {
        Stack<Character> characterStack = new Stack<>();
        characterStack.push('c');
        characterStack.push('d');
        characterStack.push('e');
        characterStack.push('f');
        characterStack.push('g');
        System.out.println(characterStack);
        System.out.println(characterStack.peek());
    }
}
