package BinaryTree;

import java.util.ArrayList;

public class LowestCommonAncestor {

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

    boolean LCS(Node root, int num, ArrayList<Node> list) {
        if (root == null) return false;

        list.add(root);

        if (root.data == num) return true;

        boolean left = LCS(root.left, num, list);
        boolean right = LCS(root.right, num, list);

        if (left || right) return true;

       list.remove(list.size()-1) ;
        return false;

    }

    int findLCS(Node root, int num1, int num2) {
        ArrayList<Node> list1 = new ArrayList<>();
        ArrayList<Node> list2 = new ArrayList<>();

        LCS(root, num1, list1);
        LCS(root, num2, list2);

        int i ;
        for (i = 0 ; i < list1.size(); i++) {
            if(list1.get(i) != list2.get(i)) break;
        }

       Node result =  list1.get(i-1) ;
        return  result.data ;


    }

    public static void main(String[] args) {
        int[] nodes = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        LowestCommonAncestor lowestCommonAncestor = new LowestCommonAncestor();
        Node root = lowestCommonAncestor.buildTree(nodes);
        System.out.println(lowestCommonAncestor.findLCS(root , 4  , 5 ));
    }
}
