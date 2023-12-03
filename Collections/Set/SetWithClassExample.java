package Collections.Set;

import java.util.HashSet;
import java.util.Set;

public class SetWithClassExample {
    public static void main(String[] args) {
        // Create a HashSet of Students
        Set<Student> studentSet = new HashSet<>();

        // Add students to the set
        Student student1 = new Student("1", "John Doe");
        Student student2 = new Student("2", "Jane Smith");

        studentSet.add(student1);
        studentSet.add(student2);
        studentSet.add(new Student("1", "John Doe")); // Duplicate, won't be added

        // Print the set
        System.out.println("Set elements: " + studentSet);

        // Check if a student exists in the set
        Student searchStudent = new Student("2", "Jane Smith");
        if (studentSet.contains(searchStudent)) {
            System.out.println(searchStudent.getName() + " is present in the set.");
        } else {
            System.out.println(searchStudent.getName() + " is not present in the set.");
        }

        // Remove a student from the set
        Student studentToRemove = new Student("1", "John Doe");
        studentSet.remove(studentToRemove);

        // Print the set after removal
        System.out.println("Set elements after removal: " + studentSet);

        // Iterate through the set
        System.out.println("\nIterating through the set:");
        for (Student student : studentSet) {
            System.out.println("Student: " + student.getName() + " (ID: " + student.getId() + ")");
        }

        // Get the size of the set
        System.out.println("\nSize of the set: " + studentSet.size());

        // Clear the set
        studentSet.clear();
        System.out.println("Set after clearing: " + studentSet);
    }
}
