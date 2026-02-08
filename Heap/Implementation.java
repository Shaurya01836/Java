package Heap;

import java.util.Comparator;
import java.util.PriorityQueue;

public class Implementation {


    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());

        pq.add(10);
        pq.add(20);
        pq.add(50);
        pq.add(30);
        pq.add(40);

        System.out.println(pq);

        while (!pq.isEmpty()) {
            System.out.print(pq.remove() + " ");
        }

    }


}
