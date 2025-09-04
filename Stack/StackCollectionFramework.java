import java.util.Stack;

public class StackCollectionFramework {

    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(10);
        s.push(50);
        s.push(15);
        s.push(11);
        while (!s.isEmpty()) {
            System.out.println(s.pop());
        }
    }

}
