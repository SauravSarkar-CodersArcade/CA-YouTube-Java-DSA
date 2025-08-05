package CodersArcade.collectionsFramework.extra;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class StudentData {
    String name;
    int marks;
    public StudentData(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }
    public String toString(){
        return name + " - " + marks;
    }
}
public class ComparatorExample {
    public static void main(String[] args) {
        List<StudentData> list = new ArrayList<>();
        list.add(new StudentData("Saurav", 50));
        list.add(new StudentData("Nikhil", 60));
        list.add(new StudentData("Milan", 80));
        Comparator<StudentData> sortByName = (s1, s2) -> s1.name.compareTo(s2.name);
        Collections.sort(list, sortByName);
        System.out.println("Sorted by name: (Comparator): " + list);
    }
}
