package BinaryTree;

import java.util.concurrent.LinkedBlockingDeque;

public class SubTreeOfAnotherTree {

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
        if (nodes[index] == -1) return null;

        Node newNode = new Node(nodes[index]);
        newNode.left = buildTree(nodes);
        newNode.right = buildTree(nodes);

        return newNode;
    }

    private boolean isIdentical(Node root, Node subTree) {
        if (root == null && subTree == null) return true;

        if (root == null || subTree == null || root.data != subTree.data) return false;

        if (!isIdentical(root.left, subTree.left)) return false;
        if (!isIdentical(root.right, subTree.right)) return false;

        return true;

    }

    boolean isSubTree(Node root, Node subTree) {

        if (root == null) return false;

        if (root.data == subTree.data) {
            if (isIdentical(root, subTree)) return true;
        }


        return isSubTree(root.left, subTree) || isSubTree(root.right, subTree);

    }


    public static void main(String[] args) {
        SubTreeOfAnotherTree subTreeOfAnotherTree = new SubTreeOfAnotherTree();
        int[] nodes = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        int[] SubTree = {2, 4, -1, -1, 5, -1, -1};

        Node root = subTreeOfAnotherTree.buildTree(nodes);
        subTreeOfAnotherTree.index = -1;
        Node subTreeNode = subTreeOfAnotherTree.buildTree(SubTree);

        System.out.println(subTreeOfAnotherTree.isSubTree(root, subTreeNode));
    }

}
