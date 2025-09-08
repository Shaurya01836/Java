import java.util.Stack;

public class QueueUsingStack {

    public static class Queue {
        static Stack<Integer> s1 = new Stack<>();
        static Stack<Integer> s2 = new Stack<>();

        public static boolean isEmpty() {
            return s1.isEmpty();
        }

        public static void add(int data) {
            while (!s1.isEmpty()) {
                s2.push(s1.pop());
            }

            s1.push(data);

            while (!s2.isEmpty()) {
                s1.push(s2.pop());
            }
        }

        public static int remove() {
            if (isEmpty()) {
                System.out.println("Queue is empty !!");
                return Integer.MIN_VALUE;
            }
            return s1.pop();
        }

        public static int peek() {
            if (isEmpty()) {
                System.out.println("Queue is empty !!");
                return Integer.MIN_VALUE;
            }
            return s1.peek();
        }
    }


    public static void main(String[] args) {
        Queue.add(10);
        Queue.add(15);
        Queue.add(12);
        Queue.add(14);
        while (!Queue.isEmpty()){
            System.out.println(Queue.remove());
        }
    }

}
