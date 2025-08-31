public class DoublyLL {

    public static class Node {
        int data;
        Node next, prev;

        Node(int data) {
            this.data = data;
            this.next = this.prev = null;
        }

        Node(int data, Node prev, Node next) {
            this.data = data;
            this.prev = prev;
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
            return;
        }
        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    }

    public void addLast(int data) {
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }

        tail.next = newNode;
        newNode.prev = tail;
        tail = newNode;
    }

    public int removeFirst() {
        if (head == null) {
            System.out.println("Empty linked list !! ");
            return Integer.MIN_VALUE;
        }
        int value = 0;
        if (size == 1) {
            value = head.data;
            head = tail = null;
            size--;
            return value;
        }
        value = head.data;
        head = head.next;
        head.prev = null;
        size--;
        return value;
    }

    public int removeLast() {
        if (head == null) {
            System.out.println("Empty linked list !! ");
            return Integer.MIN_VALUE;
        }
        int value = 0;
        if (size == 1) {
            value = head.data;
            head = tail = null;
            size--;
            return value;
        }
        value = tail.data;
        tail.prev.next = null;
        tail = tail.prev;
        size--;
        return value;
    }

    public void printList() {
        if (head == null) {
            System.out.println("Linked list is empty !!");
            return;
        }
        Node temp = head;
        while (temp != null) {
            if (temp.next == null) {
                System.out.println("[ " + temp.data + " ]");
                return;
            }
            System.out.print("[ " + temp.data + " ] <-> ");
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        DoublyLL list = new DoublyLL();
        list.addFirst(10);
        list.addFirst(20);
        list.addFirst(150);
        list.addLast(36);
        list.printList();
        System.out.println(list.removeFirst());
        list.printList();
        System.out.println(list.removeLast());
        list.printList();
    }
}
