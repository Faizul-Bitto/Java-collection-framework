import java.util.ArrayList;
import java.util.List;

class Student {

    String name;
    int age;

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "[" + this.name + ", " + this.age + "]";
    }
}

public class ListCollectionConcept {

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

        List<Student> list2 = new ArrayList<>();
        list2.add(new Student("John", 10));
        list2.add(new Student("Jane", 20));

        System.out.println(list2);

    }
}