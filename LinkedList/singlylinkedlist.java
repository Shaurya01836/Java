import java.util.Scanner;

public class singlylinkedlist {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            next = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    public void addFirst(int data) {
        // new node
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }

        //connecting the new node with linked list
        newNode.next = head;
        //make the new node as the head of the linked list
        head = newNode;
    }

    public void addLast(int data) {
        // new node
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }

        //connect the last node with the new last node
        tail.next = newNode;
        //make the new node as the head of the linked list
        tail = newNode;
    }

    public void add(int index, int data) {
        if (index == 0) {
            addFirst(data);
            return;
        }
        Node temp = head;
        int i = 0;
        while (i < index - 1) {
            temp = temp.next;
            i++;
        }
        Node newNode = new Node(data);
        size++;
        newNode.next = temp.next;
        temp.next = newNode;

    }

    public int removeFirst() {
        if (size == 0) {
            System.out.println("Linked list is empty !!");
            return Integer.MIN_VALUE;
        }
        if (size == 1) {
            int value = head.data;
            head = tail = null;
            size--;
            return value;
        }
        int value = head.data;
        head = head.next;
        size--;
        return value;
    }

    public int removeLast() {
        if (size == 0) {
            System.out.println("Linked list is empty !!");
            return Integer.MIN_VALUE;
        }
        if (size == 1) {
            int value = head.data;
            head = tail = null;
            size = 0;
            return value;
        }
        Node temp = head;
        while (temp.next.next != null) {
            temp = temp.next;
        }
        int value = temp.next.data;
        temp.next = null;
        tail = temp;
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
            System.out.print("[ " + temp.data + " ] -> ");
            temp = temp.next;
        }
    }

    public int itrSearch(int data) {
        if (size == 0) {
            System.out.println("Linked List is empty !!");
            return Integer.MIN_VALUE;
        }
        int i = 0;
        Node temp = head;
        while (temp != null) {
            if (temp.data == data) {
                return i;
            }
            temp = temp.next;
            i++;
        }
        return -1;
    }

    public int helper(Node head, int data) {
        if (head == null) {
            return -1;
        }
        if (head.data == data) {
            return 0;
        }

        int idx = helper(head.next, data);
        if (idx == -1) return -1;
        return idx + 1;
    }

    public int recSearch(int data) {
        return helper(head, data);
    }

    public void reverseLinkedList() {
        Node prev = null;
        Node curr = tail = head;
        Node next;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
    }

    public void deleteFromNth(int position) {
        if (size == position) {
            head = head.next;
        }
        int pos = (size - position) + 1;
        Node temp = head;
        for (int i = 1; i < pos -1 ; i++) {
            temp = temp.next;
        }
        temp.next = temp.next.next;
    }


    //Main function
    public static void main(String[] args) {
        singlylinkedlist list = new singlylinkedlist();
        Scanner sc = new Scanner(System.in);
        int choice = 0;
        do {
            System.out.println("Menu");
            System.out.println("1.Add element at the start");
            System.out.println("2.Add element at the end");
            System.out.println("3.Add element at a specific index");
            System.out.println("4.Remove element from the start");
            System.out.println("5.Remove element from the end");
            System.out.println("6.Remove nth element from the end");
            System.out.println("7.Print Linked list");
            System.out.println("8.Size of the linked list");
            System.out.println("9.Iterative Search element in linked list");
            System.out.println("10.Recursive Search element in linked list");
            System.out.println("11.Reverse linked list");
            System.out.println("12.Exit");
            System.out.print("Enter your choice : ");
            choice = sc.nextInt();
            int data = 0;
            switch (choice) {
                case 1:
                    System.out.print("Enter the number you want to insert at the start : ");
                    data = sc.nextInt();
                    list.addFirst(data);
                    break;
                case 2:
                    System.out.print("Enter the number you want to insert at the end : ");
                    data = sc.nextInt();
                    list.addLast(data);
                    break;
                case 3:
                    System.out.print("Enter index : ");
                    int index = sc.nextInt();
                    System.out.print("Enter the number : ");
                    data = sc.nextInt();
                    list.add(index, data);
                    break;
                case 4:
                    int value = list.removeFirst();
                    if (!(value == Integer.MIN_VALUE)) {
                        System.out.println(value + " has been deleted from the linked list !! ");
                    }
                    break;
                case 5:
                    value = list.removeLast();
                    if ((value != Integer.MIN_VALUE)) {
                        System.out.println(value + " has been deleted from the linked list !! ");
                    }
                    break;
                case 6:
                    System.out.print("Enter the nth node which you want to delete from last : ");
                    int position = sc.nextInt();
                    list.deleteFromNth(position);
                    break;
                case 7:
                    list.printList();
                    break;
                case 8:
                    System.out.println(size);
                    break;
                case 9:
                    System.out.print("Enter the number you want to search : ");
                    data = sc.nextInt();
                     position = list.itrSearch(data);
                    if (position != Integer.MIN_VALUE && position != -1) {
                        System.out.println("Your number find at " + position + " index");
                    } else if (position == -1) {
                        System.out.println("Your number not found on the list");
                    }
                    break;
                case 10:
                    System.out.print("Enter the number you want to search : ");
                    data = sc.nextInt();
                    position = list.recSearch(data);
                    if (position != Integer.MIN_VALUE && position != -1) {
                        System.out.println("Your number find at " + position + " index");
                    } else if (position == -1) {
                        System.out.println("Your number not found on the list");
                    }
                    break;
                case 11:
                    list.reverseLinkedList();
                    break;
                case 12:
                    System.out.println("Exit");
                    break;
                default:
                    System.out.println("Wrong input !!");
            }
        } while (choice != 12);


    }

}
