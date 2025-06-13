package CodersArcade.dataStructures.linearDataStructures.linkedLists.singlyLinkedList;
import java.util.ArrayList;
import java.util.List;
public class ArrayListExample {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Java");
        list.add("Python");
        list.add("SQL");
        System.out.println(list);
        for (String x : list){
            System.out.print(x + "->");
        }
        System.out.println("null");
    }
}
