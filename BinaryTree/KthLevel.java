package BinaryTree;

import java.util.LinkedList;
import java.util.Queue;

public class KthLevel {

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

         void kthLevel(Node root , int level , int k) {
                if(root == null) return;

                if(level == k) {
                    System.out.print(root.data + " ");
                    return;
                }

                kthLevel(root.left, level+1,k);
                kthLevel(root.right, level+1 ,k);
        }



    public static void main(String[] args) {
        int[] nodes = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        KthLevel kthLevel = new KthLevel();
        Node root = kthLevel.buildTree(nodes);
        kthLevel.kthLevel(root , 1 , 2);

    }
}
