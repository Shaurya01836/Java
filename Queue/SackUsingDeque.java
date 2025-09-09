import java.util.Deque;
import java.util.LinkedList;

public class SackUsingDeque {

    static class Stack {
        Deque<Integer> deque = new LinkedList<>();

        public void push(int data) {
            deque.addLast(data);
        }

        public int pop() {
            if (deque.isEmpty()) {
                System.out.println("Stack underflow !!");
                return Integer.MIN_VALUE;
            }
            return deque.removeLast();
        }

        public int peek() {
            if (deque.isEmpty()) {
                System.out.println("Stack underflow !!");
                return Integer.MIN_VALUE;
            }
            return deque.getLast();
        }
    }

    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push(10);
        stack.push(40);
        stack.push(20);
        System.out.println( stack.pop());
        System.out.println( stack.pop());
        System.out.println( stack.pop());
        System.out.println( stack.pop());
    }
}
