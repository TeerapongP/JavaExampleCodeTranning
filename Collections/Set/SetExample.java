package Collections.Set;

import java.util.HashSet;
import java.util.Set;

public class SetExample {
    public static void main(String[] args) {
        // Create a HashSet (a common implementation of Set interface)
        Set<String> stringSet = new HashSet<>();

        // Add elements to the set
        stringSet.add("Apple");
        stringSet.add("Banana+Orange");
        stringSet.add("Banana");
        stringSet.add("Orange");
        stringSet.add("Orange+Apple");
        stringSet.add("Apple");

        for (String element : stringSet) {
            System.out.println(element);
        }
    }
}
