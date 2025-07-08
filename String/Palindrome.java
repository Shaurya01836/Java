import java.util.Scanner;

public class Palindrome {

    public static boolean isPalindrome(String string) {
        int length = string.length() - 1;
        for (int i = 0; i < string.length() / 2; i++) {
            if (string.charAt(i) != string.charAt(length)) {
                return false;
            }
            length--;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String : ");
        String string = sc.next();
        if (isPalindrome(string)) {
            System.out.println("String is Palindrome");
        } else {
            System.out.println("String is not Palindrome");
        }
    }
}
