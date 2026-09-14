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

    void inorder(TreeNode root, List<Integer> list) {
        if (root == null)
            return;

        inorder(root.left, list);
        list.add(root.val);
        inorder(root.right, list);
    }

    TreeNode bst(List<Integer> list, TreeNode root, int left, int right) {

        if (left > right)
            return null;

        int mid = (left + right) / 2;

        root = new TreeNode(list.get(mid));

        root.left = bst(list, root.left, left , mid -1);

        root.right = bst(list, root.right , mid + 1 , right);

        return root;
    }

    public TreeNode balanceBST(TreeNode root) {

        List<Integer> list = new ArrayList<>();
        
        inorder(root, list);

        TreeNode newRoot = bst(list, null, 0, list.size() - 1);

        return newRoot;

    }
}