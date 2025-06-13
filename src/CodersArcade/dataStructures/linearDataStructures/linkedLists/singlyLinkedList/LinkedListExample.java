package CodersArcade.dataStructures.linearDataStructures.linkedLists.singlyLinkedList;
import java.util.LinkedList;
import java.util.List;
public class LinkedListExample {
    public static void main(String[] args) {
        List<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(13);
        list.add(21);
        list.add(15);
        System.out.println(list);
        for (int x : list){
            System.out.print(x + "->");
        }
        System.out.println("null");


    }
}
