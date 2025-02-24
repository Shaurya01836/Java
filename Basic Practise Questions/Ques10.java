// Write a Java program to check if a number is a palindrome in Java? ( 121 is a palindrome, 321 is not)
//  A number is called a palindrome if the number is equal to the reverse of a number e.g., 121 is a
//  palindrome because the reverse of 121 is 121 itself. On the other hand, 321 is not a
//  palindrome because the reverse of 321 is 123, which is not equal to 321.

import java.util.Scanner;

public class Ques10 {
    static boolean isPalindrome(int num) {
        int originalNumber = num;
        int reverseNumber = 0;
        int digit;

        while (num != 0) {
            digit = num % 10;
            reverseNumber = (reverseNumber * 10) + digit;
            num = num / 10;
        }

        if (originalNumber == reverseNumber)
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        int a;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a number : ");
        a = s.nextInt();
        s.close();
        boolean result = isPalindrome(a);
        if (result)
            System.out.println("Number is Palindrome");
        else
            System.out.println("Number is not a Palindrome");

    }
}
