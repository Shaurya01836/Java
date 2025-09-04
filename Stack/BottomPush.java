import java.util.Scanner;
import java.util.Stack;

public class BottomPush {

    public static void pushBottom(Stack<Integer> s, int data) {
        //base case
        if (s.isEmpty()) {
            s.push(data);
            return;
        }
        int top = s.pop();
        pushBottom(s, data);
        s.push(top);
    }

    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(10);
        s.push(50);
        s.push(15);
        s.push(11);
        System.out.print("Enter the number you want to put at the bottom of the stack : ");
        int data = new Scanner(System.in).nextInt();
        pushBottom(s, data);
        while (!s.isEmpty()) {
            System.out.println(s.pop());
        }
    }
}
