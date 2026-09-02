class Solution {

    List<List<Integer>> bfs(TreeNode root) {

        Queue<TreeNode> q = new LinkedList<>();
        List<List<Integer>> list = new ArrayList<>();

        q.add(root);

        while (!q.isEmpty()) {

            int size = q.size();
            List<Integer> temp = new ArrayList<>();

            boolean hasNonNull = false;

            for (int i = 0; i < size; i++) {

                TreeNode tree = q.remove();

                if (tree == null) {
                    temp.add(null);
                    q.add(null);
                    q.add(null);
                } 
                else {
                    temp.add(tree.val);
                    hasNonNull = true;

                    q.add(tree.left);
                    q.add(tree.right);
                }
            }

            if (!hasNonNull)
                break;

            list.add(temp);
        }

        return list;
    }

    public boolean isSymmetric(TreeNode root) {

        if (root == null)
            return true;

        List<List<Integer>> tree1 = bfs(root.left);
        List<List<Integer>> tree2 = bfs(root.right);

        if (tree1.size() != tree2.size())
            return false;

        for (int i = 0; i < tree1.size(); i++) {

            List<Integer> temp1 = tree1.get(i);
            List<Integer> temp2 = tree2.get(i);

            if (temp1.size() != temp2.size())
                return false;

            for (int j = 0; j < temp1.size(); j++) {

                if (!Objects.equals(
                        temp1.get(j),
                        temp2.get(temp2.size() - j - 1))) {

                    return false;
                }
            }
        }

        return true;
    }
}