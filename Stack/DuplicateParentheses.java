import java.util.Stack;

public class DuplicateParentheses {

    public static boolean isDuplicate(String string) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < string.length(); i++) {
            char ch = string.charAt(i);
            if (ch == ')') {
                int count = 0;
                while (stack.peek() != '(') {
                    count++;
                    stack.pop();
                }
                if (count < 1) {
                    return true;
                } else {
                    stack.pop();
                }
            } else {
                stack.push(ch);
            }
        }
        return false;
    }

    public static void main(String[] args) {

        String string = "(a+b)";
        boolean res = isDuplicate(string);
        if (res) {
            System.out.println("String contains duplicate parentheses");
        } else {
            System.out.println("String does not contains duplicate parentheses");
        }

    }
}
