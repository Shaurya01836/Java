package BinaryTree;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class TopView {

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

    static class Info {
        Node node;
        int horizontalDistance;

        Info(Node node, int horizontalDistance) {
            this.node = node;
            this.horizontalDistance = horizontalDistance;
        }
    }

    void topView(Node root) {
        Queue<Info> queue = new LinkedList<>();
        HashMap<Integer, Node> map = new HashMap<>();
        int min = 0 , max = 0;

        Info initial = new Info(root, 0);
        queue.add(initial);

        while (!queue.isEmpty()) {
            int size = queue.size();

            for (int i = 0; i < size; i++) {
                Info temp = queue.remove();

                if (!map.containsKey(temp.horizontalDistance)) {
                    map.put(temp.horizontalDistance, temp.node);
                }

                if (temp.node.left != null) {
                    queue.add(new Info(temp.node.left, temp.horizontalDistance - 1));
                    min = Math.min(min, temp.horizontalDistance - 1);
                }
                if (temp.node.right != null) {
                    queue.add(new Info(temp.node.right, temp.horizontalDistance + 1));
                    max = Math.max(max, temp.horizontalDistance + 1);
                }
            }
        }

        for (int i = min; i <= max; i++) {
            System.out.println(map.get(i).data + " ");
        }

    }


    public static void main(String[] args) {
        TopView topView = new TopView();
        int[] nodes = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        Node root = topView.buildTree(nodes);
        topView.topView(root);
    }


}
