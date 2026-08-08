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

    class Tree {
        int sum;
        int n;

        Tree(int sum, int n) {
            this.sum = sum;
            this.n = n;
        }
    }

    int ans = 0;

    Tree postOrder(TreeNode root) {
        if (root == null)
            return new Tree(0, 0);

        Tree left = postOrder(root.left);
        Tree right = postOrder(root.right);

        int n = left.n + right.n + 1;
        int sum = left.sum + right.sum + root.val;

        if (n != 0 && root.val == (sum / n))
            ans++;

        return new Tree(sum , n );

    }

    public int averageOfSubtree(TreeNode root) {
        postOrder(root);
        return ans;
    }
}