// Write a program to find the factorialof any number entered by the user.
//  (Hint : factorial of a number n=n*(n-1)*(n-2)*(n-3)*……*1 and exists for positive numbers
//  only. We write factorial as n!
//  So, factorial of 0! = 1, 1! = 1, 2! = 2, 3! = 6, 4! = 24 and so on.
//  Note - Please do not confuse factorial with NOT EQUAL TO operator, they are not the same)

import java.util.Scanner;

public class Ques7 {
    static int factorial(int a) {
        int factorialResult = 1;
        if (a == 0) {
            return 1;
        }
        for (int i = a; i > 0; i--) {
            factorialResult *= a;
            a--;
        }
        return factorialResult;
    }

    public static void main(String[] args) {
        int a, res;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the Number : ");
        a = s.nextInt();
        res = factorial(a);
        System.out.println("Factorial is : " + res);
        s.close();

    }
}
