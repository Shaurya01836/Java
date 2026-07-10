/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {

    int size = 0;

    ListNode reverse(ListNode head) {
        ListNode curr = head, prev = null;

        while (curr != null) {
            ListNode temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
            size++;
        }

        return prev;
    }

    public int[] nextLargerNodes(ListNode head) {

        Stack<Integer> stack = new Stack<>();

        head = reverse(head);

        int i = size - 1;
        int res[] = new int[size];

        while (head != null) {

            while(!stack.isEmpty() && stack.peek() <= head.val){
                stack.pop() ; 
            }

            if (stack.isEmpty()) {
                res[i--] = 0;
            }else{
                res[i--] = stack.peek() ; 
            }

            stack.push(head.val) ; 

            head = head.next;

        }

        return res ; 

    }
}