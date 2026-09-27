class Solution {
    public String reverseParentheses(String s) {

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch == ')') {
                StringBuilder str = new StringBuilder();
                while (!stack.isEmpty() && stack.peek() != '(') {
                    str.append(stack.pop());
                }
                stack.pop();
                  for (int j = 0; j < str.length(); j++) {
                    stack.push(str.charAt(j));
                }
            } else {
                stack.push(ch);
            }
        }

         StringBuilder res = new StringBuilder();

        for(char ch : stack){
            res.append(ch) ; 
        }

        return res.toString(); 

    }
}