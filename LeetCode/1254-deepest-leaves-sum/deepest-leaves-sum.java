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

    int depth(TreeNode root) {
        if (root == null)
            return 0;

        int left = depth(root.left);
        int right = depth(root.right);

        return Math.max(left, right) + 1;
    }

    int res = 0;

    void traverse(TreeNode root, int maxDepth, int currDepth) {
        if (root == null)
            return;

        if (root.left == null && root.right == null && maxDepth == currDepth) {
            res += root.val;
        }

        traverse(root.left, maxDepth, currDepth + 1);
        traverse(root.right, maxDepth, currDepth + 1);
    }

    public int deepestLeavesSum(TreeNode root) {
        traverse(root, depth(root), 1);

        return res;
    }
}