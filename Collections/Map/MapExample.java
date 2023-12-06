package Collections.Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapExample {
    public static void main(String[] args) {

        // Create a HashMap
        Map<String, String> studentInfo = new HashMap<>();
        studentInfo.put("StudentID", "123");
        studentInfo.put("Name", "John Doe");
        studentInfo.put("Grade", "A");

        for (Map.Entry<String, String> entry : studentInfo.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key + ": " + value);
        }

        studentInfo.put("StudentID", "123");
        studentInfo.put("Name", "John Doe");
        studentInfo.put("Grade", "A");

        // ดึง key ทั้งหมดออกมาในรูปของ Set
        Set<String> keys = studentInfo.keySet();

        // ใช้ลูป foreach เพื่อแสดง key ทั้งหมด
        for (String key : keys) {
            System.out.println("Key: " + key + ", Value: " + studentInfo.get(key));
        }
        // เก็บ key ที่ต้องการลบ

        // String keyToRemove = "Grade";
        // if (studentInfo.containsKey(keyToRemove)) {
        // // Set<String> keys = studentInfo.keySet();
        // studentInfo.remove(keyToRemove);
        // for (String key : keys) {
        // System.out.println("Key: " + key + ", Value: " + studentInfo.get(key));
        // }
        // } else {
        // System.out.println("Key '" + keyToRemove + "' does not exist in the map.");
        // }
    }
}
