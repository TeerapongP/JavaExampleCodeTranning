package Collections.Map;

import java.util.HashMap;
import java.util.Map;

public class ObjectKeyMapExample {
    public static void main(String[] args) {
        // Create a Map with keys as objects and values as strings
        Map<Object, String> objectKeyMap = new HashMap<>();

        // Create objects to be used as keys
        Object name = new Object();
        Object lastName = new Object();
        Object age = new Object();

        // Add key-value pairs to the map
        objectKeyMap.put(name, "Teerapong");
        objectKeyMap.put(lastName, "Pinkaew");
        objectKeyMap.put(age, "23");

        // Access values using keys
        System.out.println("My Name is " + objectKeyMap.get(name) + "\nMy Lastname is " + objectKeyMap.get(lastName)
                + "\nAge is " + objectKeyMap.get(age));

    }
}
