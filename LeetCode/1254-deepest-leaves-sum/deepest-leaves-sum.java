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
    public int deepestLeavesSum(TreeNode root) {

        Queue<TreeNode> q = new LinkedList<>();
        int res = 0;

        q.add(root);

        List<Integer> list = new ArrayList<>();

        while (!q.isEmpty()) {
            int size = q.size();
            list = new ArrayList<>();

            for (int i = 0; i < size; i++) {
                TreeNode curr = q.remove();

                list.add(curr.val);

                if (curr.left != null)
                    q.add(curr.left);
                if (curr.right != null)
                    q.add(curr.right);
            }
        }

        for (int i = 0; i < list.size(); i++) {
            res += list.get(i);
        }

        return res;
    }
}