package CodersArcade.dataStructures.linearDataStructures.linkedLists.singlyLinkedList.cycleDetection;
class Node {
    int data;
    Node next;
    Node(int data){
        this.data = data;
        this.next = null;
    }
}
public class CycleDetection {
    public static boolean isCycle(Node head){
        if(head == null){
            return false;
        }
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null){
            slow = slow.next; // 1 step
            fast = fast.next.next; // 2 steps
            if(slow == fast){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Node first = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);
        Node fourth = new Node(4);
        first.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = second; // Cycle exists
        System.out.println(isCycle(first) ? "Cycle Exists" : "Cycle Does Not Exist");
    }
}
