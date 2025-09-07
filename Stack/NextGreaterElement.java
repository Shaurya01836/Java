import java.util.Stack;

public class NextGreaterElement {

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        int[] arr = {6, 8, 0, 1, 3};
        int[] nextGreater = new int[arr.length];

        for (int i = arr.length - 1; i >= 0; i--) {
            while (!stack.isEmpty() && arr[i] >= stack.peek()) {
                stack.pop();
            }

            if (stack.isEmpty()) {
                nextGreater[i] = -1;
            } else {
                nextGreater[i] = stack.peek();
            }
            stack.push(arr[i]);
        }

        for (int j : arr) {
            System.out.print(j + " ");
        }
        System.out.println();

        for (int j : nextGreater) {
            System.out.print(j + " ");
        }
    }
}
