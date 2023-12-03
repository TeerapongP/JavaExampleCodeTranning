package Collections.Map;

import java.util.HashMap;
import java.util.Map;

public class ClassKeyExample {
    public static void main(String[] args) {

        // Map ที่มี key เป็น Class Student และ value เป็น Integer
        Map<Student, Integer> studentAgeMap = new HashMap<>();

        // เพิ่ม key-value pairs
        Student student1 = new Student("John");
        Student student2 = new Student("Jane");

        studentAgeMap.put(student1, 15);
        studentAgeMap.put(student2, 18);

        // แสดงผลลัพธ์
        for (Map.Entry<Student, Integer> entry : studentAgeMap.entrySet()) {
            System.out.println("Student: " + entry.getKey().getName() + ", Age: " + entry.getValue());
        }

    }
}
