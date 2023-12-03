package Collections.Map;

import java.util.HashMap;
import java.util.Map;

public class MapExample {
    public static void main(String[] args) {
        // Create a HashMap
        Map<String, String> studentInfo = new HashMap<>();

        // Add key-value pairs
        studentInfo.put("StudentID", "123");
        studentInfo.put("Name", "John Doe");
        studentInfo.put("Grade", "A");

        // Access values using keys
        System.out.println("Student ID: " + studentInfo.get("StudentID"));
        System.out.println("Name: " + studentInfo.get("Name"));
        System.out.println("Grade: " + studentInfo.get("Grade"));

        // Iterate through the map
        System.out.println("\nIterating through the map:");
        for (Map.Entry<String, String> entry : studentInfo.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        // Check if a key exists
        String keyToCheck = "Grade";
        if (studentInfo.containsKey(keyToCheck)) {
            System.out.println("\n" + keyToCheck + " exists in the map.");
        } else {
            System.out.println("\n" + keyToCheck + " does not exist in the map.");
        }

        // Remove a key-value pair
        String keyToRemove = "Grade";
        studentInfo.remove(keyToRemove);
        System.out.println("\nAfter removing " + keyToRemove + ": " + studentInfo);
    }
}
