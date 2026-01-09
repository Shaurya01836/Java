package BinaryTree;

public class MinimumDistance {

    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
            this.left = this.right = null;
        }
    }

    static int index = -1;

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

    int minDistance(Node root, int num) {
        if (root == null) return -1;
        if (root.data == num) return 0;

        int left = minDistance(root.left, num);
        int right = minDistance(root.right, num);

        if (left != -1 && right != -1) {
            return -1;
        } else if (left == -1) {
            return right + 1;
        } else return left + 1;
    }

    public static void main(String[] args) {

        int[] nodes = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        MinimumDistance minimumDistance = new MinimumDistance();
        Node root = minimumDistance.buildTree(nodes);
        System.out.println(minimumDistance.minDistance(root, 4) + minimumDistance.minDistance(root, 6));
    }

}
