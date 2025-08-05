import java.util.ArrayList;
public class VarExample {
    public static void main(String[] args) {
        var name = "Saurav";
        System.out.println("Name " + name);
        var age = 37;
        System.out.println(age);
        var cities = new ArrayList<>();
        cities.add("Mysore");
        cities.add("Bangalore");
        cities.add(1);
        for (var data : cities){
            System.out.println(data);
        }
    }

}
