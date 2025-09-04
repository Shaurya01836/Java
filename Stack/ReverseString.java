import java.util.Scanner;
import java.util.Stack;

public class ReverseString {

    public static void main(String[] args) {
        Stack<Character> s = new Stack<>();
        System.out.print("Enter a sentence : ");
        String string = new Scanner(System.in).nextLine();
        for (int i = 0; i < string.length(); i++) {
            s.push(string.charAt(i));
        }
        StringBuilder str = new StringBuilder();

        for (int i = 0; i < string.length(); i++) {
            str.append(s.pop());
        }

        System.out.println(str);
    }
}
