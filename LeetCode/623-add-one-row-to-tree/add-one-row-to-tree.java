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

    void dfs(TreeNode root, int val, int depth, int curr) {
        if (root == null)
            return;

        if (curr >= depth)
            return;

        dfs(root.left, val, depth, curr + 1);
        dfs(root.right, val, depth, curr + 1);

        if (curr == depth - 1) {
            TreeNode tempLeft = root.left;
            TreeNode tempRight = root.right;

            root.left = new TreeNode(val);
            root.right = new TreeNode(val);

            root.left.left = tempLeft;
            root.right.right = tempRight;
        }

    }

    public TreeNode addOneRow(TreeNode root, int val, int depth) {

        if (depth == 1) {
            return new TreeNode(val, root, null);
        }

        dfs(root, val, depth, 1);
        return root;
    }
}