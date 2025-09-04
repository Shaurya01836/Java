public class StackLinkedList {

    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }

        Node(int data, Node next) {
            this.data = data;
            this.next = next;
        }
    }

    public static class Stack {
        static Node head = null;

        public static boolean isEmpty() {
            return head == null;
        }

        public static void push(int data) {
            Node newNode = new Node(data);
            if (isEmpty()) {
                head = newNode;
                return;
            }
            newNode.next = head;
            head = newNode;
        }

        public static int pop() {
            if (isEmpty()) {
                System.out.println("Stack Underflow !!");
                return Integer.MIN_VALUE;
            }
            int top = head.data;
            head = head.next;
            return top;
        }

        public static int peek() {
            if (isEmpty()) {
                System.out.println("Stack Underflow !!");
                return Integer.MIN_VALUE;
            }

            return head.data;
        }
    }

    public static void main(String[] args) {
        Stack.push(10);
        Stack.push(50);
        Stack.push(14);
        Stack.push(80);
        System.out.println(Stack.peek());
        System.out.println(Stack.pop());
    }

}
