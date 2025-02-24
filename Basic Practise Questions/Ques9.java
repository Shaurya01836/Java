//  Write a method named isEven that accepts an int argument. The method
//  should return true if the argument is even, or false otherwise. Also write a program to test your
//  method.

import java.util.Scanner;

public class Ques9 {

    static boolean isEven(int num) {
        if (num % 2 == 0)
            return true;
        else
            return false;

    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a;
        System.out.print("Enter a number : ");
        a = s.nextInt();
        s.close();
        boolean result = isEven(a);
        if (result)
            System.out.println("Number is Even");
        else
            System.out.println("Number is odd");
    }
}
