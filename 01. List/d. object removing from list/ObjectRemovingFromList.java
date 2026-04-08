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

    @Override
    public boolean equals(Object obj) {

        if (obj instanceof Student s) {
            return this.age == s.age && this.name.equals(s.name);
        }

        return false;
    }
}

public class ObjectRemovingFromList {

    public static void main(String[] args) {

        List<Student> list = new ArrayList<>();
        list.add(new Student("John", 10));
        list.add(new Student("Jane", 20));
        System.out.println(list);

        System.out.println("\n");

        // remove object from list
        list.remove(new Student("Jane", 20));
        System.out.println(list);
    }
}
