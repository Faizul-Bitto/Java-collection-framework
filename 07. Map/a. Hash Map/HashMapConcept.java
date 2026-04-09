// no insertion order, no sorted order among the keys

import java.util.HashMap;
import java.util.Map;

public class HashMapConcept {

    public static void main(String[] args) {

        Map<Integer, String> hashMap = new HashMap<>();

        hashMap.put(1, "John");
        hashMap.put(2, "Jane");
        hashMap.put(7, "Max");
        hashMap.put(17, "Jenny");

        // update
        hashMap.put(17, hashMap.get(17) + " Doe");

        // print both key -> value
        for (Map.Entry<Integer, String> entry : hashMap.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        System.out.println("\n");
        // print only key
        for (Integer key : hashMap.keySet()) {
            System.out.println(key);
        }

        System.out.println("\n");
        // print only value
        for (String value : hashMap.values()) {
            System.out.println(value);
        }

        System.out.println(hashMap.containsKey(19));
        System.out.println(hashMap.containsValue("Jane"));
    }
}
