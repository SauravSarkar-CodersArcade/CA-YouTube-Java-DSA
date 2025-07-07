package CodersArcade.collectionsFramework;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
public class MapExample {
    public static void main(String[] args) {
        HashMap<String, String> map = new LinkedHashMap<>();
        map.put("01", "aaaa");
        map.put("03", "cccc");
        map.put("02", "bbbb" );
        map.put("05", "xxxx");
        map.put("04", "yyyy");
        for (Map.Entry<String, String>  entry : map.entrySet() ){
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

    }
}
