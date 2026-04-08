import java.util.Stack;

public class StackConcepts {

    public static void main(String[] args) {

        Stack<Integer> list = new Stack<>();

        list.push(10);
        list.push(20);
        list.push(30);

        System.out.println(list.peek());

        list.pop();

        System.out.println(list);

        for (Integer i : list) {
            System.out.print(i + ", ");
        }
    }
}
