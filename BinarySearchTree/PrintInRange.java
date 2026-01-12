package BinarySearchTree;

public class PrintInRange {


    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
            this.left = this.right = null;
        }
    }

    Node buildTree(Node root, int num) {
        if (root == null) {
            return new Node(num);
        }

        if (root.data > num) {
            root.left = buildTree(root.left, num);
        } else {
            root.right = buildTree(root.right, num);
        }

        return root;
    }

    void printInRange(Node root, int n1, int n2) {
        if (root == null) return;

        if (root.data >= n1 && root.data <= n2) {
            printInRange(root.left, n1, n2);
            System.out.print(root.data + " ");
            printInRange(root.right, n1, n2);
        } else if (root.data < n1) {
            printInRange(root.left, n1, n2);
        } else {
            printInRange(root.right, n1, n2);
        }
    }


    public static void main(String[] args) {
        PrintInRange printInRange = new PrintInRange();
        int[] nodes = {8, 5, 3, 1, 4, 6, 10, 11, 14};
        Node root = null;

        for (int i : nodes) {
            root = printInRange.buildTree(root, i);
        }
        printInRange.printInRange(root , 5 , 12);


    }


}
