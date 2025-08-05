package CodersArcade.collectionsFramework.extra;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
class StudentDemo implements Comparable<StudentDemo> {
    String name;
    int marks;
    public StudentDemo(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }


    public String toString(){
        return name + " - " + marks;
    }


    @Override
    public int compareTo(StudentDemo o) {

            return o.marks - this.marks;

    }
}
public class ComparableExample {
    public static void main(String[] args) {
        List<StudentDemo> list = new ArrayList<>();
        list.add(new StudentDemo("Learning", 80));
        list.add(new StudentDemo("Bhuvan Reddy", 60));
        list.add(new StudentDemo("Vatsal", 70));
        Collections.sort(list);
        System.out.println(list);
    }
}
