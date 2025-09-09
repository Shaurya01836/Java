import java.util.Deque;
import java.util.LinkedList;

public class QueueUsingDeque {

    static class Queue {
        Deque<Integer> deque = new LinkedList<>();

        public void add(int data) {
            deque.addLast(data);
        }

        public int remove() {
            if (deque.isEmpty()) {
                System.out.println("Queue is empty !!");
                return Integer.MIN_VALUE;
            }
            return deque.removeFirst();
        }

        public int peek() {
            if (deque.isEmpty()) {
                System.out.println("Queue is empty !!");
                return Integer.MIN_VALUE;
            }
            return deque.getFirst();
        }
    }

    public static void main(String[] args) {
        Queue queue = new Queue();
        queue.add(10);
        System.out.println(queue.peek());
        System.out.println(queue.remove());
        System.out.println(queue.remove());
    }
}
