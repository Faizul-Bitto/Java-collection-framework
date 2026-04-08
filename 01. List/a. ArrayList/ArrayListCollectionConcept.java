import java.util.ArrayList;

public class ArrayListCollectionConcept {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        // auto boxing
        list.add(6);

        // add
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

        // remove element of a specific index
        list.remove(3);
        System.out.println(list);

        // remove a specific value, not index
        list.remove(Integer.valueOf(100));
        System.out.println(list);

        // size of the list
        System.out.println(list.size());
    }
}