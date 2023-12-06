package Collections.Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class ObjectKeyMapExample {
    public static void main(String[] args) {
        // Create a generic Map with keys as objects and values as Strings
        Map<Object, String> objectStringMap = new HashMap<>();

        // Putting entries into the map
        objectStringMap.put("key1", "Value1");
        objectStringMap.put(123, "Value2");

        // get values using objects as keys
        System.out.println(objectStringMap.get("key1"));
        System.out.println(objectStringMap.get(123));

    }
}
// Retrieve the set of keys
// Set<Object> keySet = objectStringMap.keySet();

// // Iterate over the keys and print them
// for (Object key : keySet) {
// System.out.println("Key: " + key);
// }