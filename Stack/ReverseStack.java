import java.util.Scanner;
import java.util.Stack;

public class ReverseStack {
    public static void pushBottom(Stack<Integer> s, int data) {
        if (s.isEmpty()) {
            s.push(data);
            return;
        }

        int top = s.pop();
        pushBottom(s, data);
        s.push(top);
    }

    public static void reverseStack(Stack<Integer> s) {
        if (s.isEmpty()) {
            return;
        }
        int top = s.pop();
        reverseStack(s);
        pushBottom(s, top);
    }

    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(10);
        s.push(50);
        s.push(15);
        s.push(11);
        while (!s.isEmpty()) {
            System.out.print(s.pop() + " ");
        }
        System.out.println();
        s.push(10);
        s.push(50);
        s.push(15);
        s.push(11);
        reverseStack(s);
        while (!s.isEmpty()) {
            System.out.print(s.pop() + " ");
        }
    }
}
