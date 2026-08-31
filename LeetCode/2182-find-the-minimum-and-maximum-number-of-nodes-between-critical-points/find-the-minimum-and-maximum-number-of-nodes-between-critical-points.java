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
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        int[] res = new int[2] ; 

        ListNode temp = head , prev = null ; 

        int i = 1 ; 

        List<Integer> criticalPoints = new ArrayList<>() ; 

        while(temp!= null){

            if(prev != null && temp.next != null){
               if (prev.val > temp.val && temp.val < temp.next.val) criticalPoints.add(i) ; 
               if (prev.val < temp.val && temp.val > temp.next.val) criticalPoints.add(i) ; 

            }

            prev = temp ; 
            temp = temp.next ; 
            i++ ; 

        }

        if(criticalPoints.size() < 2){
            return new int[]{-1 , -1} ; 
        } 

        int minDist = Integer.MAX_VALUE;
        for ( i = 1; i < criticalPoints.size(); i++) {
            minDist = Math.min(minDist, criticalPoints.get(i) - criticalPoints.get(i - 1));
        }

        int maxDist = criticalPoints.get(criticalPoints.size() - 1) - criticalPoints.get(0);

        res[0] = minDist ; 
        res[1] = maxDist ; 

        return res ; 


        
    }
}