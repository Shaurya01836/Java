/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {

    int max = 0;

    void rec(TreeNode root, boolean dir, int len) {

        if (root == null)
            return;

        max = Math.max(len , max) ; 

        if (dir) {
            rec(root.right, false, len + 1);

            rec(root.left, true, 1);
        }else {
            rec(root.left, true, len + 1);

            rec(root.right, false, 1);
        }
    }

    public int longestZigZag(TreeNode root) {
        max = 0 ;
        rec(root , true , 0);
        rec(root , false , 0) ; 

        return max;

    }
}