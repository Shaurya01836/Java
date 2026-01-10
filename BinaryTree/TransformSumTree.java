package BinaryTree;

public class TransformSumTree {

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

    int transformSum(Node root) {
        if (root == null) return 0;

        int left = transformSum(root.left);
        int right = transformSum(root.right);
        int data = root.data;
        root.data = left + right;
        return data + root.data;
    }

    void preorder(Node root) {
        if (root == null) return;
        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }


    public static void main(String[] args) {
        TransformSumTree transformSumTree = new TransformSumTree();
        int[] nodes = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        Node root = transformSumTree.buildTree(nodes);
        transformSumTree.transformSum(root);
        transformSumTree.preorder(root);
    }


}
