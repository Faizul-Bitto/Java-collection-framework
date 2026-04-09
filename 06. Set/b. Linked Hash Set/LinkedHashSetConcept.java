// set always removes the duplicate. That means there will be no duplicate values
// set takes the help of 'equals()' method to know which is duplicate 

// * Insertion order will be maintained

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetConcept {

    public static void main(String[] args) {

        Set<Integer> linkedHashSet = new LinkedHashSet<>();

        linkedHashSet.add(1);
        linkedHashSet.add(8);
        linkedHashSet.add(4);
        linkedHashSet.add(3);
        linkedHashSet.add(8);

        linkedHashSet.remove(3); // by default value, not index

        for (Integer hash : linkedHashSet) {
            System.out.println(hash);
        }

        System.out.println(linkedHashSet.contains(1));
        System.out.println(linkedHashSet.contains(10));
    }
}