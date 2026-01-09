package BinaryTree;

public class KthAncestorOfNode {

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

    int kthAncestor(Node root, int num, int k) {

        if (root == null) return -1;
        if (root.data == num) return 0;

        int left = kthAncestor(root.left, num, k);
        int right = kthAncestor(root.right, num, k);

        if (left == -1 && right == -1) return -1;
        int max = Math.max(left, right);

        if (max + 1 == k) {
            System.out.println(root.data);
        }

        return max + 1;

    }


    public static void main(String[] args) {
        KthAncestorOfNode kthAncestorOfNode = new KthAncestorOfNode();
        int[] nodes = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        Node root = kthAncestorOfNode.buildTree(nodes);
        kthAncestorOfNode.kthAncestor(root , 4 , 2);

    }


}
