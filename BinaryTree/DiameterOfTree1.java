package BinaryTree;

public class DiameterOfTree1 {

    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    int index = -1;

    Node buildTree(int[] nodes) {
        index++;
        if (nodes[index] == -1) {
            return null;
        }

        Node newNode = new Node(nodes[index]);
        newNode.left = buildTree(nodes);
        newNode.right = buildTree(nodes);

        return newNode;
    }

    static int height(Node root) {
        if (root == null) return 0;

        int lh = height(root.left);
        int rh = height(root.right);

        return Math.max(lh, rh) + 1;
    }

    // Time complexity - O(n^2)
    int diameter(Node root) {
        if (root == null) return 0;

        int ld = diameter(root.left);
        int rd = diameter(root.right);
        int lh = height(root.left);
        int rh = height(root.right);

        return Math.max(ld, Math.max(rd, lh + rh + 1));

    }

    public static void main(String[] args) {
        DiameterOfTree1 diameterOfTree1 = new DiameterOfTree1();
        int[] nodes = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        Node root = diameterOfTree1.buildTree(nodes);
        System.out.println(diameterOfTree1.diameter(root));

    }

}
