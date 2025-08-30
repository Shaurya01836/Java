
import java.util.Scanner;

public class RemoveCycle {
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


    public void removeCycle() {
        Node fast = head, slow = head;
        boolean isCycle = false;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) {
                isCycle = true;
               break;
            }
        }

        if(isCycle){
            slow = head;
            Node prev = fast;
            while (slow != fast){
                prev = fast;
                slow = slow.next;
                fast = fast.next;
            }
            prev.next = null;
            System.out.println("The Cycle in the linked list removed !! ");
        }else{
            System.out.println("There is no cycle in the linked list !! ");
        }

    }

    //Main function
    public static void main(String[] args) {
        RemoveCycle list = new RemoveCycle();
        head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = head.next;
        list.removeCycle();
        list.printList();
    }

}
