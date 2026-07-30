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

    int maxPath = Integer.MIN_VALUE;

    int rec(TreeNode root) {
        if (root == null)
            return 0;

        int left = Math.max(0, rec(root.left));
        int right = Math.max(0, rec(root.right));

        int curr = root.val + left + right;

        maxPath = Math.max(maxPath, curr);

        return Math.max(root.val + left, root.val + right);
    }

    public int maxPathSum(TreeNode root) {
        rec(root);

        return maxPath;
    }
}