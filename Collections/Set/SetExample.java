package Collections.Set;

import java.util.HashSet;
import java.util.Set;

public class SetExample {
    public static void main(String[] args) {
        // Create a HashSet (a common implementation of Set interface)
        Set<String> stringSet = new HashSet<>();

        // Add elements to the set
        stringSet.add("Apple");
        stringSet.add("Banana");
        stringSet.add("Orange");
        stringSet.add("Apple"); // Duplicate element, won't be added

        // Print the set
        System.out.println("Set elements: " + stringSet);

        // Check if an element exists in the set
        String searchElement = "Banana";
        if (stringSet.contains(searchElement)) {
            System.out.println(searchElement + " is present in the set.");
        } else {
            System.out.println(searchElement + " is not present in the set.");
        }

        // Remove an element from the set
        String elementToRemove = "Orange";
        stringSet.remove(elementToRemove);

        // Print the set after removal
        System.out.println("Set elements after removal: " + stringSet);

        // Iterate through the set
        System.out.println("\nIterating through the set:");
        for (String element : stringSet) {
            System.out.println("Element: " + element);
        }

        // Get the size of the set
        System.out.println("\nSize of the set: " + stringSet.size());

        // Clear the set
        stringSet.clear();
        System.out.println("Set after clearing: " + stringSet);
    }
}
