package CodersArcade.collectionsFramework;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
public class ListExample {
    public static void main(String[] args) {
        List<Integer> numList = new ArrayList<>();
        numList.add(1);
        numList.add(2);
        numList.add(3);
        numList.add(4);
        System.out.println(numList);
        List<String> nameList = new LinkedList<>();
        nameList.add("Saurav");
        nameList.add("Sarkar");
        nameList.add("Coders");
        nameList.add("Arcade");
        System.out.println(nameList);
        List anonymous = new ArrayList(); // Old-fashioned way of List Creation
        anonymous.add("Java");
        anonymous.add(1);
        anonymous.add(true);
        System.out.println(anonymous);
        for (Object obj : anonymous){
            System.out.print(obj + " ");
        }

    }
}
