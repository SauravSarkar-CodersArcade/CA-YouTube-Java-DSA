package CodersArcade.collectionsFramework;
import java.util.ArrayList;
import java.util.Collections;
public class CollectionsClassExample {
    public static void main(String[] args) {
        ArrayList<Integer> integers = new ArrayList<>();
        integers.add(0);
        integers.add(100);
        integers.add(19);
        integers.add(110);
        integers.add(0);
        System.out.println("Before: " + integers);
        Collections.sort(integers);
        System.out.println("After: " + integers);


    }
}
