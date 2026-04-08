import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

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

public class ListIteratorConcept {

    public static void main(String[] args) {

        List<Student> list = new ArrayList<>();
        list.add(new Student("John", 10));
        list.add(new Student("Jane", 20));
        System.out.println(list);

        System.out.println("\n");

        ListIterator<Student> listIterator = list.listIterator();
        // hasNext -> next value -> return boolean
        while (listIterator.hasNext()) {
            System.out.println(listIterator.next());
        }
        System.out.println("\n");

        // hasNext -> next value -> return boolean
        while (listIterator.hasPrevious()) {
            System.out.println(listIterator.previous());
        }
        System.out.println("\n");

        // enhanced for loop
        for (Student s : list) {
            System.out.println(s);
        }
    }
}