// set always removes the duplicate. That means there will be no duplicate values
// set takes the help of 'equals()' method to know which is duplicate 

// * No order will be valued in HashSet -> insertion order will not be maintained

import java.util.HashSet;
import java.util.Set;

public class HashSetConcept {

    public static void main(String[] args) {

        Set<Integer> hashSet = new HashSet<>();

        hashSet.add(1);
        hashSet.add(8);
        hashSet.add(4);
        hashSet.add(3);
        hashSet.add(8);

        hashSet.remove(8); // by default value, not index

        for(Integer hash : hashSet){
            System.out.println(hash);
        }

        System.out.println(hashSet.contains(1));
        System.out.println(hashSet.contains(10));
    }
}