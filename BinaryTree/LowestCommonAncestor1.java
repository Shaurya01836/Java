package BinaryTree;


public class LowestCommonAncestor1 {

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



    Node findLCS(Node root, int num1, int num2) {

        if( root == null ||root.data == num1 || root.data == num2 ) return root ;

        Node left = findLCS(root.left , num1 , num2);
        Node right = findLCS(root.right , num1 , num2);

        if(left == null) return right;
        if(right == null) return left ;

        return root ;

    }

    public static void main(String[] args) {
        int[] nodes = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        LowestCommonAncestor1 lowestCommonAncestor = new LowestCommonAncestor1();
        Node root = lowestCommonAncestor.buildTree(nodes);
        System.out.println((lowestCommonAncestor.findLCS(root , 4  , 5 )).data);
    }
}
