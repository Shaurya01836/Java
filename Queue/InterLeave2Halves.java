import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class InterLeave2Halves {

    public static void makeQueueInterLeave(Queue<Integer> q1) {
        int size = q1.size();
        Queue<Integer> q2 = new LinkedList<>();
        for (int i = 0; i < size / 2; i++) {
            q2.add(q1.remove());
        }
        while (!q2.isEmpty()) {
            q1.add(q2.remove());
            q1.add(q1.remove());
        }
    }

    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of element you want to insert (Even) : ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int val = sc.nextInt();
            q.add(val);
        }
        makeQueueInterLeave(q);
        System.out.println(q);
    }
}
