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

    int res = 0;

    void dfs(TreeNode root, int[] arr) {

        if (root == null) {
            return;
        }

        arr[root.val]++;

        if (root.left == null && root.right == null) {
            int cnt = 0;
            for (int i = 0; i < 10; i++) {
                if (arr[i] % 2 != 0)
                    cnt++;
            }

            if (cnt <= 1)
                res++;
        }

        dfs(root.left, arr);
        dfs(root.right, arr);
        arr[root.val]--;

    }

    public int pseudoPalindromicPaths(TreeNode root) {

        int[] arr = new int[10];
        dfs(root, arr);
        return res;

    }
}