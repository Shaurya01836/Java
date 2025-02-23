// Write a program to print the multiplication table of a number N,entered by the user.

import java.util.Scanner;

public class Ques8 {
    public static void main(String[] args) {
        int a;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number,which multiplication table you want : ");
        a = s.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println(a + " x " + i + " = " + a * i);
        }
        s.close();
    }
}
