import java.util.Map;
import java.util.Stack;

public class MaximumRectangularArea {

    public static int MaxArea(int[] height) {
        int maxArea = 0;
        int[] nextSmallerRight = new int[height.length];
        int[] nextSmallerLeft = new int[height.length];

        //next smaller right
        Stack<Integer> stack1 = new Stack<>();

        for (int i = height.length - 1; i >= 0; i--) {
            while (!stack1.isEmpty() && height[i] <= height[stack1.peek()]) {
                stack1.pop();
            }
            if (stack1.isEmpty()) {
                nextSmallerRight[i] = height.length;
            } else {
                nextSmallerRight[i] = stack1.peek();
            }
            stack1.push(i);
        }

        //next smaller left
        stack1 = new Stack<>();

        for (int i = 0; i < height.length; i++) {
            while (!stack1.isEmpty() && height[i] <= height[stack1.peek()]) {
                stack1.pop();
            }
            if (stack1.isEmpty()) {
                nextSmallerLeft[i] = -1;
            } else {
                nextSmallerLeft[i] = stack1.peek();
            }
            stack1.push(i);
        }

        //now calculate the current width => (j-i-1)
        for (int i = 0; i < height.length; i++) {
            int width = nextSmallerRight[i] - nextSmallerLeft[i] - 1;
            int currArea = (height[i] * width);
            maxArea = Math.max(currArea, maxArea);
        }
        return maxArea;
    }

    public static void main(String[] args) {
        int[] height = {2, 1, 5, 6, 2, 3};
        System.out.println("Max Area : " + MaxArea(height));

    }

}
