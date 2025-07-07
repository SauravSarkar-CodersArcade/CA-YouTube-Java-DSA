package CodersArcade.collectionsFramework;
import java.util.Hashtable;
import java.util.Map;
public class HashtableDemo {
    public static void main(String[] args) {
        Hashtable<Integer, String> ht = new Hashtable<>();
        ht.put(106, "Blue Eyed Boy");
        ht.put(117, "Prisha Mehta");
        ht.put(128, "Ayush");
        ht.put(99, "Saurav Sarkar");
        ht.put(100, "Coders Arcade");
        for (Map.Entry<Integer, String> entry : ht.entrySet()){
            System.out.println(entry.getKey() + " "+ entry.getValue());
        }
        System.out.println(ht);
        System.out.println(ht.size());
        char[] letters = {'B','E','B'};
        int[] arr = {1,2,3};
        System.out.println(arr);
        String name = letters.toString();
        System.out.println(name);
    }
}
