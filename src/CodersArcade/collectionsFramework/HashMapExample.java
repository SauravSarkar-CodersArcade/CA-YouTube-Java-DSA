package CodersArcade.collectionsFramework;
import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
    public static void main(String[] args) {
        HashMap<String, Integer> marks = new HashMap<>();
        marks.put("Maths", 89);
        marks.put("Science", 90);
        marks.put("Maths", 95); // It will replace the earlier value
        marks.put("Maths", 5); // It will replace the earlier value
        System.out.println(marks);
        for (Map.Entry<String, Integer> entry : marks.entrySet()){
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}
