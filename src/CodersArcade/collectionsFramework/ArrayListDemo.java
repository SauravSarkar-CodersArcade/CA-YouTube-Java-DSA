package CodersArcade.collectionsFramework;
import java.util.ArrayList;
public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Mango");
        fruits.add("Apple");
        fruits.add("Guava");
        System.out.println(fruits.contains("Mango"));
        System.out.println(fruits.contains("App"));
        System.out.println(fruits);
        fruits.remove("Mango");
        System.out.println(fruits);
    }
}
