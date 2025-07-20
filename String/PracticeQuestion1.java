//Count how many times lowercase vowels occurred in a String entered by the user.

import java.util.Scanner;

public class PracticeQuestion1 {

    public static int noOfLowercaseVowels(String string) {
        int count = 0;
        char ch;
        for (int i = 0; i < string.length(); i++) {
            ch = string.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++;
            }
        }
        return count;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String : ");
        String string = sc.nextLine();
        System.out.println("Number of lowercase vowels occured in string are : " + noOfLowercaseVowels(string));
    }
}
