import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

public class QueueUsingJavaCollectionFramework {


    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        //we can also implement this by ArrayDequeue
        //Queue<Integer> queue = new ArrayDeque<>();
        for (int i = 0; i < 5; i++) {
            queue.add((int) (Math.random() * 100));
        }
        while (!queue.isEmpty()) {
            System.out.println(queue.remove());
        }
    }

}
