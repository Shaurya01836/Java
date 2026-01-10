package BinarySearchTree;

public class BuildBST {

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

    void inorder(Node root) {
        if (root == null) return;
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }


    public static void main(String[] args) {
        int[] number = {5, 1, 3, 4, 2, 7};
        BuildBST buildBST = new BuildBST();
        Node root = null;

        for (int i : number) {
            root = buildBST.buildTree(root, i);
        }

        buildBST.inorder(root);

    }
}
