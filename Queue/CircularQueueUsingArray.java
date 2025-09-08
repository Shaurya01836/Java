import com.sun.source.tree.ReturnTree;

public class CircularQueueUsingArray {

    public static class circularQueue {
        static int[] arr;
        static int size;
        static int front, rear;

        circularQueue(int n) {
            arr = new int[n];
            size = n;
            front = rear = -1;
        }

        public static boolean isEmpty() {
            return (rear == -1);
        }

        public static boolean isFull() {
            return (rear + 1) % size == front;
        }

        public static void add(int data) {
            if (isFull()) {
                System.out.println("Sorry we can not add another element because queue is full !");
                return;
            }
            if (front == -1) {
                front = 0;
            }
            rear = (rear + 1) % size;
            arr[rear] = data;
        }

        public static int remove() {
            if (isEmpty()) {
                System.out.println("Sorry but the queue is empty so we can no remove any element currently !!");
                return Integer.MIN_VALUE;
            }
            int val = arr[front];

            if (rear == front) {
                rear = front = -1;
            } else {
                front = (front + 1) % size;
            }
            return val;
        }

        public static int peek() {
            if (isEmpty()) {
                System.out.println("Sorry but the queue is empty!!");
                return Integer.MIN_VALUE;
            }
            return arr[front];
        }
    }

    public static void main(String[] args) {
        circularQueue circularqueue = new circularQueue(5);
        circularQueue.add(20);
        circularQueue.add(30);
        circularQueue.add(50);
        while (!circularQueue.isEmpty()) {
            System.out.println(circularQueue.remove());
        }
    }

}
