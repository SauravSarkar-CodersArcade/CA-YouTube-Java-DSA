package CodersArcade.collectionsFramework.extra;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class SortMapByValue {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("Apple", 40);
        map.put("Banana", 10);
        map.put("Mango", 30);
        List<Map.Entry<String, Integer>> entries = new ArrayList<>(map.entrySet());
        entries.sort(Map.Entry.comparingByValue());
        for (Map.Entry<String, Integer> entry : entries){
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
