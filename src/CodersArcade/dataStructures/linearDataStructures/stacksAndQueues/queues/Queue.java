package CodersArcade.dataStructures.linearDataStructures.stacksAndQueues.queues;
public class Queue {
    private static final int MAX_SIZE = 5;
    private int[] arr = new int[MAX_SIZE];
    private int front;
    private int rear;
    public Queue(){
        front = rear = -1; // The Queue is empty by default
    }
    public boolean isEmpty(){
        return (front == -1 && rear == -1);
    }
    public boolean isFull(){
        return rear == MAX_SIZE - 1;
    }
    public void enqueue(int data){
        if(isFull()){
            System.out.println("Queue is full. Can't add " + data);
            return;
        }
        if(isEmpty()){
            front = rear = 0;
        }
        else {
            rear++;
        }
        arr[rear] = data;
        System.out.println("Enqueued " + data + " into the queue.");
    }
    public void dequeue(){
        if(isEmpty()){
            System.out.println("Queue is empty. Can't remove data.");
            return;
        }
        else if(front == rear){
            front = rear = -1;
        }else {
            front++;
        }
    }
    public int getFront(){
        if(isEmpty()){
            System.out.println("Queue is empty. No front element.");
            return -1;
        }
        return arr[front];
    }
    public int getRear(){
        if(isEmpty()){
            System.out.println("Queue is empty. No rear element.");
            return -1;
        }
        return arr[rear];
    }
    public int getSize(){
        if(isEmpty()) return 0;
        return rear-front+1;
    }
    public void display(){
        if(isEmpty()){
            System.out.println("Queue is empty.");
            return;
        }
        System.out.print("The queue elements from front to rear are: ");
        for (int i=front; i<=rear; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Queue queue = new Queue();
        int[] values = {1,2,3,4,5,6,7,8};
        for (int x : values){
            queue.enqueue(x);
        }
        queue.display();
        queue.dequeue();
        queue.display();
        System.out.println(queue.getSize());
    }

}
