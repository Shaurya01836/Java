import java.sql.SQLOutput;

public class QueueUsingLinkedList {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static class Queue {
        static Node head = null;
        static Node tail = null;

        public static boolean isEmpty() {
            return head == null && tail == null;
        }

        public static void add(int data) {
            Node newNode = new Node(data);

            if (head == null) {
                head = tail = newNode;
                return;
            }
            tail.next = newNode;
            tail = newNode;
        }

        public static int remove() {
            if (isEmpty()) {
                System.out.println("Queue is empty !!");
                return Integer.MIN_VALUE;
            }
            int val = head.data;
            if (tail == head) {
                head = tail = null;
            } else {
                head = head.next;
            }

            return val;
        }

        public static int peek() {
            if (isEmpty()) {
                System.out.println("Queue is empty !!");
                return Integer.MIN_VALUE;
            }
            return head.data;
        }
    }

    public static void main(String[] args) {
        Queue.add(5);
        Queue.add(15);
        Queue.add(55);
        Queue.add(57);
        while (!Queue.isEmpty()){
            System.out.println(Queue.remove());
        }
    }

}
