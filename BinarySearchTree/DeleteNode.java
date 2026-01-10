package BinarySearchTree;

import java.util.Scanner;

public class DeleteNode {

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

    Node delete(Node root, int val) {
        if (root == null) return null;

        if (root.data > val) {
            root.left = delete(root.left, val);
        } else if (root.data < val) {
            root.right = delete(root.right, val);
        } else {

            //case 1 : No child
            if (root.left == null && root.right == null) {
                return null;
            } else if (root.left == null) return root.right;
            else if (root.right == null) return root.left;
            else {
                Node inOrder = foundInorder(root.right);
                root.data = inOrder.data;
                root.right = delete(root.right, inOrder.data);
            }
        }

        return root;
    }

    Node foundInorder(Node root) {
        while (root.left != null) {
            root = root.left;
        }
        return root;
    }

    void inorderTraverse(Node root) {
        if (root == null) return;

        inorderTraverse(root.left);
        System.out.print(root.data + " ");
        inorderTraverse(root.right);
    }

    public static void main(String[] args) {
        DeleteNode node = new DeleteNode();
        int[] nodes = {8, 5, 3, 1, 4, 6, 10, 11, 14};
        Node root = null;

        for (int i : nodes) {
            root = node.buildTree(root, i);
        }

        node.inorderTraverse(root);
        System.out.println();

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number you want to delete :");
        int num = sc.nextInt();

        node.delete(root, num);

        node.inorderTraverse(root);


    }

}
