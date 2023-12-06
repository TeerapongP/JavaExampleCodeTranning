package Collections.ListMap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FruitExample {
    public static void main(String[] args) {
        // สร้าง List เพื่อเก็บข้อมูลผลไม้
        List<Map<String, Object>> fruitList = new ArrayList<>();

        // เพิ่มข้อมูลผลไม้ใน List
        Map<String, Object> apple = new HashMap<>();
        apple.put("name", "Apple");
        apple.put("color", "Red");
        apple.put("taste", "Sweet");
        fruitList.add(apple);

        Map<String, Object> banana = new HashMap<>();
        banana.put("name", "Banana");
        banana.put("color", "Yellow");
        banana.put("taste", "Sweet");
        fruitList.add(banana);

        Map<String, Object> orange = new HashMap<>();
        orange.put("name", "Orange");
        orange.put("color", "Orange");
        orange.put("taste", "Citrus");
        fruitList.add(orange);

        // แสดงข้อมูลผลไม้ทั้งหมดใน List
        for (Map<String, Object> fruit : fruitList) {
            System.out.println("Name: " + fruit.get("name") +
                    ", Color: " + fruit.get("color") +
                    ", Taste: " + fruit.get("taste"));
        }
    }

}
