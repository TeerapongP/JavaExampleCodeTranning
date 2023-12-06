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
        // Check if a student exists in the set

        System.out.println(student1.getName());
    }
}
