import java.util.Deque;
import java.util.LinkedList;

public class DequeUsingJCF {

    public static void main(String[] args) {
        Deque<Integer> deque = new LinkedList<>();
        deque.addFirst(10);
        deque.addFirst(20);
        deque.addFirst(15);
        deque.addLast(500);
        deque.addLast(580);
        deque.addLast(550);
        System.out.println(deque.removeFirst());
        System.out.println(deque.removeLast());
        System.out.println(deque.remove());
    }
}
