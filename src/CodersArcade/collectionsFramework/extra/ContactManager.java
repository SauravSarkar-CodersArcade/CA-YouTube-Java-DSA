package CodersArcade.collectionsFramework.extra;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class ContactManager {
    public static void main(String[] args) {
        Map<String,  List<String>> contacts = new HashMap<>();
        // Add contacts to existing or new contacts
        contacts.computeIfAbsent("KS", k -> new ArrayList<>()).add("9876543210");
        contacts.computeIfAbsent("KS", k -> new ArrayList<>()).add("1234567890");
        contacts.computeIfAbsent("Vatsal", k -> new ArrayList<>()).add("1234123456");
        contacts.computeIfAbsent("XYZ", k -> new ArrayList<>()).add("9876598765");
        contacts.computeIfAbsent("XYZ", k -> new ArrayList<>()).add("98765123556");
        contacts.computeIfAbsent("XYZ", k -> new ArrayList<>()).add("98765123556");
        // Display All the contacts:
        System.out.println("Contact List: ");
        for (Map.Entry<String, List<String>> entry : contacts.entrySet()){
            System.out.println(entry.getKey() + " => " + entry.getValue());
        }
    }
}
