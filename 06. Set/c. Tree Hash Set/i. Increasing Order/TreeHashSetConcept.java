// set always removes the duplicate. That means there will be no duplicate values
// set takes the help of 'equals()' method to know which is duplicate 

// * By default in increasing order

import java.util.Set;
import java.util.TreeSet;

public class TreeHashSetConcept {

    public static void main(String[] args) {

        Set<Integer> maxSet = new TreeSet<>();

        maxSet.add(1);
        maxSet.add(8);
        maxSet.add(4);
        maxSet.add(3);
        maxSet.add(8);

        maxSet.remove(3); // by default value, not index

        for (Integer hash : maxSet) {
            System.out.println(hash);
        }

        System.out.println(maxSet.contains(1));
        System.out.println(maxSet.contains(10));
    }
}