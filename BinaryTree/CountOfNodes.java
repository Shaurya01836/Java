package BinaryTree;

public class CountOfNodes {

    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
            this.left = this.right = null;
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

    int countNodes(Node root) {
        if (root == null) {
            return 0;
        }

        int lc = countNodes(root.left);
        int rc = countNodes(root.right);
        return (lc + rc) + 1;
    }

    public static void main(String[] args) {
        int[] nodes = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        CountOfNodes countOfNodes = new CountOfNodes();
        Node root = countOfNodes.buildTree(nodes);
        System.out.println(countOfNodes.countNodes(root));
    }
}
