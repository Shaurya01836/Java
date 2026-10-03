class Solution {
    public int longestValidParentheses(String s) {

        Stack<Integer> stack = new Stack<>();
        stack.push(-1);

        int cnt = 0;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch == ')') {
                stack.pop(); 
                if (stack.isEmpty())
                    stack.push(i);
                else
                    cnt = Math.max(cnt, i - stack.peek());

            } else {
                stack.push(i);
            }
        }

        return cnt;
    }
}