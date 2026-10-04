class Solution {
    public boolean checkValidString(String s) {
        Stack<Integer> stack = new Stack<>();
        Stack<Integer> ast = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '(') {
                stack.push(i);
            } else if (ch == '*') {
                ast.push(i);
            } else {
                if (!stack.isEmpty()) {
                    stack.pop();
                } else if (!ast.isEmpty()) {
                    ast.pop();
                } else {
                    return false;
                }
            }
        }

        while(!stack.isEmpty() && !ast.isEmpty()){
            if(stack.peek() > ast.peek()){
                return false ; 
            }
            stack.pop();
            ast.pop();
        }
        return stack.isEmpty() ; 
    }
}