import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListSortingConcept {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(6);
        list.add(5);
        // get
        System.out.println(list.get(0));
        // add in a particular index
        list.add(0, 7);
        System.out.println(list);
        // change value in a specific index
        list.set(0, 9);
        System.out.println(list);
        // insert at first
        list.addFirst(10);
        System.out.println(list);
        // insert at last
        list.addLast(100);
        System.out.println(list);

        System.out.println("\n");

        // sort
        Collections.sort(list);
        System.out.println(list);
        System.out.println("\n");

        // printing manually
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + ", ");
        }

    }
}