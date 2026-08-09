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

    public ListNode removeNodes(ListNode head) {

        ListNode temp = head;

        ArrayList<Integer> list = new ArrayList<>();

        while (temp != null) {
            list.add(temp.val);
            temp = temp.next;
        }

        int[] greater = new int[list.size()];

        Stack<Integer> stack = new Stack<>();

        for (int i = list.size() - 1; i >= 0; i--) {

            while (!stack.isEmpty() && stack.peek() <= list.get(i)) {
                stack.pop();
            }

            if (stack.isEmpty())
                greater[i] = -1 ; 
            else
                greater[i] = stack.peek();

            stack.push(list.get(i));
        }

        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;

        for (int i = 0; i < list.size(); i++) {
            if (greater[i] == -1) {
                curr.next = new ListNode(list.get(i));
                curr = curr.next;
            }
        }

        return dummy.next;

    }
}