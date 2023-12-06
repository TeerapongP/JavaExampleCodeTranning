package Collections.ListMapStringObject;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class listMapStringObj {
    public static void main(String[] args) {
        // Create a List of Map<String, Student>
        List<Map<String, Student>> studentList = new ArrayList<>();

        // Add some students to the list
        studentList.add(createStudentMap("ID001", "John", 20));
        studentList.add(createStudentMap("ID002", "Alice", 22));

        // Iterate through the list and implicitly call toString
        for (Map<String, Student> studentMap : studentList) {
            for (Map.Entry<String, Student> entry : studentMap.entrySet()) {
                String studentId = entry.getKey();
                Student student = entry.getValue();
                System.out.println("Student ID: " + studentId + ", Student Info: " + student);
            }
        }
    }

    private static Map<String, Student> createStudentMap(String studentId, String name, int age) {
        Map<String, Student> studentMap = new HashMap<>();
        Student student = new Student(name, age);
        studentMap.put(studentId, student);
        return studentMap;
    }
}
