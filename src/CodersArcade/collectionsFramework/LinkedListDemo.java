package CodersArcade.collectionsFramework;
import java.util.LinkedList;
public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<String> cities = new LinkedList<>();
        cities.add("Delhi");
        cities.addFirst("Mumbai");
        cities.addLast("Bangalore");
        System.out.println(cities);
    }
}
