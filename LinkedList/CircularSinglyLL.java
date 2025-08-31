public class CircularSinglyLL {

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

    public static Node head, tail;
    public static int size;

    public void addFirst(int data) {
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            newNode.next = head;
            return;
        }

        newNode.next = head;
        head = newNode;
        tail.next = head;

    }

    public int removeFirst() {
        if (head == null) {
            System.out.println("This is an empty linked list !!");
            return Integer.MIN_VALUE;
        }
        int value = head.data;
        if (size == 1) {
            head = tail = null;
            return value;
        }
        head = head.next;
        tail.next = head;
        return value;
    }

    public void printList() {
        if (head == null) {
            System.out.println("Linked list is empty !!");
            return;
        }
        Node temp = head;
        do {
            if (temp.next == head) {
                System.out.println("[ " + temp.data + " ]");
                return;
            }
            System.out.print("[ " + temp.data + " ] -> ");
            temp = temp.next;
        } while (temp != head);
    }

    public static void main(String[] args) {
        CircularSinglyLL list = new CircularSinglyLL();
        list.addFirst(10);
        list.addFirst(70);
        list.addFirst(15);
        list.printList();
        System.out.println(list.removeFirst());
        System.out.println(list.removeFirst());
        list.printList();
    }
}
