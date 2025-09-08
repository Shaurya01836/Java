public class QueueUsingArray {

    public static class Queue {
        static int[] arr;
        static int size;
        static int rear;

        Queue(int n) {
            arr = new int[n];
            size = n;
            rear = -1;
        }

        public static boolean isEmpty() {
            return rear == -1;
        }

        //O(1)
        public static void add(int data) {
            if (rear == size - 1) {
                System.out.println("Queue is full we can not add more elements now !! ");
                return;
            }
            rear++;
            arr[rear] = data;
        }

        //O(n)
        public static int remove() {
            if (isEmpty()) {
                System.out.println("Queue is empty we can not remove any element now !!");
                return Integer.MIN_VALUE;
            }
            int front = arr[0];
            for (int i = 0; i < rear; i++) {
                arr[i] = arr[i + 1];
            }
            rear--;
            return front;
        }

        public static int peek() {
            if (isEmpty()) {
                System.out.println("Queue is empty we can not remove any element now !!");
                return Integer.MIN_VALUE;
            }
            return arr[0];
        }
    }

    public static void main(String[] args) {
        Queue queue = new Queue(5);
        Queue.add(5);
        Queue.add(15);
        Queue.add(25);
        while (!Queue.isEmpty()) {
            System.out.println(Queue.remove());
        }

    }

}
