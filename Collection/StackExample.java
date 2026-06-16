package Collection;
import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        Stack<Integer> num = new Stack<>();
        num.push(1);
        num.push(2);
        num.push(3);
        System.out.println(num);

        System.out.println("Printing top element");
        System.out.println(num.peek());

        System.out.println("Removing top element");
        num.pop();
        System.out.println(num);


        System.out.println(num.search(2));

        num.clear();
        System.out.println(num);

        System.out.println(num.isEmpty());
    }
    
}
