// Write a Java program to get a number from the user and print whether it is
// positive or negative

import java.util.Scanner;

public class Ques4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a;
        System.out.print("Enter a Number : ");
        a = s.nextInt();
        if (a > 0) {
            System.out.println("Number is Positive");
        } else if (a == 0) {
            System.out.println("Number is neither Positive nor Negative");
        } else {
            System.out.println("Number is Negative");
        }
    }
}
