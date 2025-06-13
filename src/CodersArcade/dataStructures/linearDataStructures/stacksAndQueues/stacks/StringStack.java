package CodersArcade.dataStructures.linearDataStructures.stacksAndQueues.stacks;
public class StringStack {
    int data = 22;
    private static final int MAX_SIZE = 10;
    private String[] arr = new String[MAX_SIZE];
    private int top = -1; // By-default the stack is empty
    public boolean isEmpty(){
        return top == -1;
    }
    public boolean isFull(){
        return top == MAX_SIZE - 1;
    }
    public void push(String data){
        if(isFull()){
            System.out.println("Stack Overflow. Can't push " + data);
            return;
        }
        arr[++top] = data;
        System.out.println("The string: " + data + " was pushed.");
    }
    public String pop(){
        if(isEmpty()){
            System.out.println("Stack Underflow. Can't pop any data.");
            return null;
        }
        String popped = arr[top--];
        return popped;
    }
    public void display(){
        if(isEmpty()){
            System.out.println("Stack Underflow. Can't display elements.");
            return;
        }
        System.out.print("Stack Elements: " );
        for (int i=0; i<=top; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public int size(){
        return top + 1;
    }
    public String peek(){
        if(isEmpty()){
            System.out.println("Stack Underflow. No top element.");
            return null;
        }
        return arr[top];
    }
    public static void main(String[] args) {
        StringStack stack = new StringStack();
        stack.push("Apple");
        stack.push("Mango");
        stack.push("Avocado");
        System.out.println("Top element: " +stack.peek());
        stack.display();
        System.out.println(stack.size());
        stack.pop();
        stack.display();
    }

}
