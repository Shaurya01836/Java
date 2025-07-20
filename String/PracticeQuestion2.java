//Determine if 2 Strings are anagrams of each other.
//What are anagrams?
//If two strings contain the same characters but in a different order,they can be said to be anagrams.Consider race and care.
//In this case,race's characters can be formed into a study,or care's
//characters can be formed into race.

import java.util.Arrays;
import java.util.Scanner;

public class PracticeQuestion2 {

    public static boolean isAnagrams(String string1, String string2) {
        string1 = string1.toLowerCase();
        string2 = string2.toLowerCase();

        if (string1.length() == string2.length()) {

            //converting the string into char array if the length of string is equal
            char[] str1 = string1.toCharArray();
            char[] str2 = string2.toCharArray();

            //sorting the array
            Arrays.sort(str1);
            Arrays.sort(str2);

            //if sorted array is equal then both are anagrams
            if (Arrays.equals(str1, str2)) {
                return true;
            } else {
                return false;
            }
        }
        //if the length of the both strings are not equal then it can not be a anagrams
        else {
            return false;
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String1 : ");
        String string1 = sc.nextLine();
        System.out.print("Enter String2 : ");
        String string2 = sc.nextLine();
        if (isAnagrams(string1, string2)) {
            System.out.println("Both Strings are anagrams of each other !");
        } else {
            System.out.println("Both Strings are not anagrams of each other !");
        }

    }

}
