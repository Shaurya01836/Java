import java.util.Scanner;

public class CheckPalindrome {
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
        for (int i = 1; i < pos - 1; i++) {
            temp = temp.next;
        }
        temp.next = temp.next.next;
    }

    //helper fn for palindrome
    public Node findMid(Node head) {
        Node slow = head, fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public boolean isPalindrome() {
        //base case
        if (head == null || head.next == null) {
            return true;
        }

        Node midNode = findMid(head);

        //now reverse the half list
        Node prev = null;
        Node currNode = midNode;
        Node next;

        while (currNode != null) {
            next = currNode.next;
            currNode.next = prev;
            prev = currNode;
            currNode = next;
        }

        Node right = prev;
        Node left = head;
        while (right != null) {
            if (left.data != right.data) {
                return false;
            }
            left = left.next;
            right = right.next;
        }
        return true;
    }

    //Main function
    public static void main(String[] args) {
        CheckPalindrome list = new CheckPalindrome();
        list.addFirst(1);
        list.addFirst(2);
        list.addFirst(3);
        boolean res = list.isPalindrome();
        System.out.println(res);

    }

}
