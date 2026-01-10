package BinarySearchTree;

import java.util.Scanner;

public class SearchInBst {


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

    Boolean search(Node root, int key) {
        if (root == null) return false;

        if (root.data == key) return true;

        if (root.data > key) return search(root.left, key);
        else return search(root.right, key);

    }

    public static void main(String[] args) {
        SearchInBst searchInBst = new SearchInBst();
        int[] nodes = {5, 1, 3, 4, 2, 7};
        Node root = null;

        for (int i : nodes) {
                root = searchInBst.buildTree(root, i);
        }

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number you want to search : ");
        int key = sc.nextInt();

        if (searchInBst.search(root, key)) System.out.println("Node found in tree");
        else System.out.println("Node not found in tree");


    }


}
