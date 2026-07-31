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

    List<Integer> traverse(TreeNode root, List<Integer> list) {
        if (root == null)
            return list;

        traverse(root.left , list);
        list.add(root.val);
        traverse(root.right , list);

        return list;
    }

    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {

        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();

        list1 = traverse(root1, list1);
        list2 = traverse(root2, list2);

        List<Integer> res = new ArrayList<>();

        int i = 0, j = 0;

        while (i < list1.size() && j < list2.size()) {
            if (list1.get(i) <= list2.get(j)) {
                res.add(list1.get(i));
                i++;
            } else {
                res.add(list2.get(j));
                j++;
            }
        }

       
        while (i < list1.size()) {
            res.add(list1.get(i));
            i++;
        }

        
        while (j < list2.size()) {
            res.add(list2.get(j));
            j++;
        }

        return res;

    }
}