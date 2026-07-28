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
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        int cnt = 0;

        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;

        while (list1 != null) {
            curr.next = new ListNode(list1.val);
            curr = curr.next;
            list1 = list1.next;
            cnt++;

            if (cnt == a) {
                while (list2 != null) {
                    curr.next = new ListNode(list2.val);
                    curr = curr.next;
                    list2 = list2.next;
                }

                while (list1 != null && cnt <= b) {
                    list1 = list1.next;
                    cnt++;
                }
            }

        }

        while (list2 != null) {
            curr.next = new ListNode(list2.val);
            curr = curr.next;
            list2 = list2.next;
        }

        return dummy.next;
    }
}