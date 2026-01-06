package BinaryTree;

public class DiameterOfTree2 {

    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
            this.left = this.right = null;
        }

    }

    static class Info {
        int diameter;
        int height;

        Info(int diameter, int height) {
            this.diameter = diameter;
            this.height = height;
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


    // Time complexity - O(n)
    Info Diameter(Node root) {
        if (root == null) {
            return new Info(0,0);
        }

        Info left = Diameter(root.left);
        Info right = Diameter(root.right);

        int height = Math.max(left.height, right.height) + 1;
        int diameter = Math.max(left.diameter, Math.max(right.diameter, left.height + right.height + 1));

        return new Info(diameter, height);

    }

    public static void main(String[] args) {
        DiameterOfTree2 diameterOfTree2 = new DiameterOfTree2();
        int[] nodes = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        Node root = diameterOfTree2.buildTree(nodes);
        Info result = diameterOfTree2.Diameter(root);
        System.out.println("Diameter of the tree:" + result.diameter);
        System.out.println("Height of the tree:" + result.height);
    }

}
