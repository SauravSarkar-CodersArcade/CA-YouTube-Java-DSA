package CodersArcade.collectionsFramework.extra;
import java.util.HashMap;
import java.util.Map;
public class FrequencyCountIntegerMap {
    public static void main(String[] args) {
        int[] items = {1,2,1,2,3,4,1,2};
        Map<Integer, Integer> freq = new HashMap<>();
        for (int item : items){
            freq.put(item, freq.getOrDefault(item, 0) + 1);
        }
        System.out.println(freq);
    }
}
