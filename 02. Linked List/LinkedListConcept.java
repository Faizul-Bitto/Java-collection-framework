import java.util.LinkedList;
import java.util.List;

public class LinkedListConcept {

    public static void main(String[] args) {

        List<Integer> list = new LinkedList<>();
        list.add(10);
        list.add(20);

        list.remove(0);
        list.remove(Integer.valueOf(20));

        list.addFirst(30);
        list.addLast(40);

        list.set(0, 50);

        System.out.println(list);
        System.out.println(list.get(1));
    }

}
