
// Map is a collection of key and value pair

// It is a combination of set (keys) and list (values)

// import java.util.Collections;
// import java.util.HashMap;
import java.util.Hashtable;
// import java.util.Iterator;
import java.util.Map;

public class MapsUsage {
    public static void main(String[] args) {
        // HashTable is synchronized - so if there are multiple threads working on it, then it is advised to use HashTable
        // Map<String, Integer> students = new HashMap<>();
        Map<String, Integer> students = new Hashtable<>();
        students.put("Saurin", 90);
        students.put("Devy", 95);
        students.put("Hritik", 80);
        students.put("Pragu", 100);
        students.put("Saurin", 100);


        System.out.println(students.keySet());

        for(String name: students.keySet()) {
            System.out.println(name + " : " + students.get(name));
        }
    }
}
