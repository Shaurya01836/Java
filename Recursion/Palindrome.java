package Recursion;

public class Palindrome {

    static boolean isPalindrome(String s, int l, int r) {
        if(l == r) return  true ;

        return (s.charAt(l) == s.charAt(r)) && isPalindrome(s , ++l , --r) ;
    }

    public static void main(String[] args) {
        String st = "nitin";
        boolean result = isPalindrome(st, 0, st.length() - 1);
        if(result) System.out.println("String is a palindrome");
        else System.out.println("String is not a palindrome");
    }
}
