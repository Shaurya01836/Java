//Problem Statement 📝
//You are given a number (e.g., 2019). Convert it into a string of its digits spoken in English, like “two zero one nine”.
//Use a recursive function to solve this problem.

//Note: The digits of the number will only be in the range 0-9.The last digit of a number can’t be 0.

//Sample Input : 1947
//Sample Output: one nine four seven


import java.util.Scanner;

public class PracticeProblem2 {

    static String word[] = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};

    public static void NumberToString(int num) {
        if (num == 0) {
            return;
        }

        int lastDigit = num % 10;
        NumberToString(num / 10);
        System.out.print(word[lastDigit] + " ");

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int number = sc.nextInt();
       NumberToString(number);
    }
}
