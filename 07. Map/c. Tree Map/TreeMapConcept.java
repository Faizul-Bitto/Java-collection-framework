// insertion order maintained by default, for decreasing order, use lambda

import java.util.Map;
import java.util.TreeMap;

public class TreeMapConcept {

    public static void main(String[] args) {

        Map<Integer, String> treeMap = new TreeMap<>((a, b) -> (b - a));

        treeMap.put(1, "John");
        treeMap.put(2, "Jane");
        treeMap.put(7, "Max");
        treeMap.put(17, "Jenny");

        // update
        treeMap.put(17, treeMap.get(17) + " Doe");

        // print both key -> value
        for (Map.Entry<Integer, String> entry : treeMap.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        System.out.println("\n");
        // print only key
        for (Integer key : treeMap.keySet()) {
            System.out.println(key);
        }

        System.out.println("\n");
        // print only value
        for (String value : treeMap.values()) {
            System.out.println(value);
        }

        System.out.println(treeMap.containsKey(19));
        System.out.println(treeMap.containsValue("Jane"));
    }
}
