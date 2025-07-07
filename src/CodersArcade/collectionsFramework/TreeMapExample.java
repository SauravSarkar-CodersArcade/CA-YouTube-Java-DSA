package CodersArcade.collectionsFramework;
import java.util.TreeMap;
// O(log n) put(), remove(), get()
public class TreeMapExample {
    public static void main(String[] args) {
        TreeMap<Integer, String > map = new TreeMap<>();
        map.put(3,"Three");
        map.put(1, "One");
        map.put(2, "Two");
        System.out.println(map);
    }
}
