// insertion order maintained

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapConcept {

    public static void main(String[] args) {

        Map<Integer, String> linkedHashMap = new LinkedHashMap<>();

        linkedHashMap.put(1, "John");
        linkedHashMap.put(2, "Jane");
        linkedHashMap.put(7, "Max");
        linkedHashMap.put(17, "Jenny");

        // update
        linkedHashMap.put(17, linkedHashMap.get(17) + " Doe");

        // print both key -> value
        for (Map.Entry<Integer, String> entry : linkedHashMap.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        System.out.println("\n");
        // print only key
        for (Integer key : linkedHashMap.keySet()) {
            System.out.println(key);
        }

        System.out.println("\n");
        // print only value
        for (String value : linkedHashMap.values()) {
            System.out.println(value);
        }

        System.out.println(linkedHashMap.containsKey(19));
        System.out.println(linkedHashMap.containsValue("Jane"));
    }
}
