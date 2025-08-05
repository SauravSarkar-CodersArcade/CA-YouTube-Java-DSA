package CodersArcade.collectionsFramework.extra;
import java.util.ArrayList;
import java.util.List;
class Student {
    String name;
    int marks;
    int credit_score;
    public Student(String name, int marks, int credit_score) {
        this.name = name;
        this.marks = marks;
        this.credit_score = credit_score;
    }
    public String toString(){
        return name + " - " + marks;
    }
}
public class CustomComparatorSort {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        list.add(new Student("Learning", 80, 5));
        list.add(new Student("Bhuvan Reddy", 60, 3));
        list.add(new Student("Vatsal", 70,7));
        list.sort((s1, s2) -> s2.credit_score - s1.credit_score); // DESCENDING ORDER
        System.out.println(list);
    }
}
