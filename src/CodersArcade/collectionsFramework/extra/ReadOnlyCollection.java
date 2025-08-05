package CodersArcade.collectionsFramework.extra;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class ReadOnlyCollection {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Java");
        list.add("Python");
        List<String> readOnlyList = Collections.unmodifiableList(list);
        System.out.println("Read Only List: " + readOnlyList);
        readOnlyList.add("C++");
    }
}
