package CodersArcade.dataStructures.linearDataStructures.linkedLists.singlyLinkedList;
class LL{
    Node head;
    private int size;
    LL(){
        size = 0;
    }
    public class Node {
        String data;
        Node next;
        Node(String data){
            this.data = data;
            this.next = null; // We don't have access to the next node initially
            size++; // Increment the number of nodes
        }
    }
    public void printList(){
        Node curr = head;
        while (curr != null){
            System.out.print(curr.data + " -> ");
            curr = curr.next;
        }
        System.out.println("null");
    }
    public void addFirst(String data){
        // Create a new node
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }
    public void addLast(String data){
        // Create a new node
        Node newNode = new Node(data);
        // Empty List:
        if(head == null){
            head = newNode;
            return;
        }
        // Multiple Nodes -> Find the last node and insert the newNode after that
        Node last = head;
        while (last.next != null){
            last = last.next;
        }
        // After the execution of this loop, the curr will be at the end
        // Insert the new node after the curr
        last.next = newNode;

    }
    public void removeFirst(){
        if(head == null){
            System.out.println("List is empty. Can't delete the first node.");
            return;
        }
        // For a single node, the head will point to the next node (null)
        // For multiple nodes, head will point to the next node (not null)
        head = this.head.next;
    }
    public void removeLast(){
        if(head == null){
            System.out.println("List is empty. Can't delete the last node.");
            return;
        }
        // Single element
        if(head.next == null){
            head = null;
            return;
        }
        // Multiple elements
        Node curr = head;
        Node last = head.next;
        while (last.next != null){
            curr = last;
            last = last.next;
        }
        curr.next = null;
    }
    public void removeTarget(String target){
        if(head == null){
            System.out.println("List is empty. Can't delete the target node.");
            return;
        }
        // Case : target is at tne head node
        if(head.data.equals(target)){
            head = head.next;
            size--;
            return;
        }
        // Case: target is anywhere in the list
        Node prev = null;
        Node curr = head;
        while (curr != null && !curr.data.equals(target)){
            prev = curr;
            curr = curr.next;
        }
        if(curr == null){
            System.out.println("Target not found...!!!");
            return;
        }
        prev.next = curr.next; // Adjust the previous & the next node links
        size--;
    }
    public static void main(String[] args) {
        LL list = new LL();
        list.addFirst("Coders Arcade");
        list.addFirst("Channel");
        list.addFirst("Our");
        list.addLast("has");
        list.addLast("50k+");
        list.addLast("Subscribers");
        list.printList();
        list.removeFirst();
        list.printList();
        list.removeLast();
        list.printList();
        list.removeTarget("Saurav");
        list.removeTarget("has");
        list.printList();
    }
}

