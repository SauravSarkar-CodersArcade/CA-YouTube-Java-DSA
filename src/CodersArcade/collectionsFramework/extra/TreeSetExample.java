package CodersArcade.collectionsFramework.extra;
import java.util.TreeSet;
public class TreeSetExample {
    public static void main(String[] args) {
        TreeSet<Integer> scores = new TreeSet<>();
        scores.add(100);
        scores.add(10);
        scores.add(100);
        scores.add(10);
        scores.add(50);
        System.out.println(scores);
    }
}
