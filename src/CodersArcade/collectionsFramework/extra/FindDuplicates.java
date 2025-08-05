package CodersArcade.collectionsFramework.extra;
import java.util.*;
public class FindDuplicates {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("A", "B","C","D","A","B","E");
        Set<String> seen = new HashSet<>();
        Set<String> duplicates = new HashSet<>();
        for (String item : list){
            if(!seen.add(item)){
                duplicates.add(item);
            }
        }
        System.out.println("Duplicates: " + duplicates);
    }
}
