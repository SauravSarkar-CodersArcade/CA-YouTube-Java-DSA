package CodersArcade.dataStructures.linearDataStructures.linkedLists.doublyLinkedList;
class DoublyLinkedList{
    Node head;
    private int size;
    DoublyLinkedList(){
        size = 0;
    }
    public class Node {
        String data;
        Node next;
        Node prev;

        Node(String data) {
            this.data = data;
            this.next = null;
            this.prev = null;
            size++;
        }
    }
        public void printList(){
            Node curr = head;
            System.out.print("null <--> ");
            while (curr != null){
                System.out.print(curr.data + " <--> "); // This indicates bidirectional
                curr = curr.next;
            }
            System.out.println("null");
        }
        public void addFirst(String data){
            Node newNode = new Node(data);
            newNode.next = head;
            if (head != null){
                head.prev = newNode; // Connect both ways
            }
            head = newNode;
        }
        public void addLast(String data){
            Node newNode = new Node(data);
            if(head == null){
                head = newNode;
                return;
            }
            Node last = head;
            while (last.next != null){
                last = last.next;
            }
            last.next = newNode;
            newNode.prev = last; // Maintains the bidirectional link
        }

    public static void main(String[] args) {
        DoublyLinkedList dll = new DoublyLinkedList();
        dll.addFirst("Coders Arcade");
        dll.addFirst("Channel");
        dll.addFirst("Our");
        dll.addLast("started");
        dll.addLast("in");
        dll.addLast("03-01-2021");
        dll.printList();
    }
}

