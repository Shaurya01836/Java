class Solution {
    public int minInsertions(String s) {
        Stack<Character> stack = new Stack<>();
        int res = 0;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch == '(') {
                stack.push(ch);
            } else {
                if (i + 1 < s.length() && s.charAt(i + 1) == ')') {
                   
                    if (stack.isEmpty()) {
                        res++; 
                    } else {
                        stack.pop();
                    }

                    i++; 
                } else {
                    
                    res++; 

                    if (stack.isEmpty()) {
                        res++; 
                    } else {
                        stack.pop();
                    }
                }
            }
        }

    
        res += 2 * stack.size();

        return res;
    }
}
