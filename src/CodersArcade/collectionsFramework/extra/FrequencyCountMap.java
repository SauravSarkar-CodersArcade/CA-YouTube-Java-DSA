package CodersArcade.collectionsFramework.extra;
import java.util.HashMap;
import java.util.Map;
public class FrequencyCountMap {
    public static void main(String[] args) {
        String[] items = {"apple", "banana", "apple", "orange", "avocado", "apple",
        "banana"};
        Map<String, Integer> freq = new HashMap<>();
        for (String item : items){
            freq.put(item, freq.getOrDefault(item, 0) + 1);
        }
        System.out.println(freq);
    }
}
