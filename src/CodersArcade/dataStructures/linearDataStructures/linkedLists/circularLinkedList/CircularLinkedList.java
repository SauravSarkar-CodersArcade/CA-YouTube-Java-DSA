package CodersArcade.dataStructures.linearDataStructures.linkedLists.circularLinkedList;
class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
        this.next = null; // Initially the node is not connected to any node
    }
}
public class CircularLinkedList {
    private Node head;
    public CircularLinkedList(){
        head = null;
    }
    public void printListElements(){
        if(head == null){
            System.out.println("List is empty!!");
            return;
        }
        Node temp = head;
        do{
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }while (temp != head);
        System.out.println("head");
    }
    public void insertAtFront(int newValue){
        Node newNode = new Node(newValue);
        if(head == null){
            newNode.next = newNode;
            head = newNode;
            return;
        }
        Node last = head;
        while (last.next != head){
            last = last.next;
        }
        newNode.next = head;
        last.next = newNode;
        head = newNode;
    }
    public void insertAtEnd(int newValue){
        Node newNode = new Node(newValue);
        if(head == null){
            newNode.next = newNode;
            head = newNode;
            return;
        }
        Node last = head;
        while (last.next != head){
            last = last.next;
        }
        newNode.next = head;
        last.next = newNode;
    }
    public void deleteFrontNode(){
        if(head == null){
            System.out.println("List is empty..!!");
            return;
        }
        if(head.next == head){
            head = null;
            return;
        }
        Node last = head;
        while (last.next != head){
            last = last.next;
        }
        head = head.next;
        last.next = head;
    }
    public void deleteEndNode(){
        if(head == null){
            System.out.println("List is empty..!!!");
            return;
        }
        if (head.next == head){
            head = null;
            return;
        }
        Node secondLast = head;
        Node last = head.next;
        while (last.next != head){
            secondLast = last;
            last = last.next;
        }
        secondLast.next = head;
    }
    public static void main(String[] args) {
        CircularLinkedList cll = new CircularLinkedList();
        cll.insertAtFront(3);
        cll.insertAtFront(2);
        cll.insertAtFront(1);
        cll.printListElements();
        cll.insertAtEnd(4);
        cll.insertAtEnd(5);
        cll.printListElements();
        cll.deleteFrontNode();
        cll.printListElements();
        cll.deleteEndNode();
        cll.printListElements();
    }
}
