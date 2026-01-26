package Recursion;

import java.util.Scanner;

public class Sum {

    // Parameterised Recursion
    public static void sum(int n, int sum) {
        if (n < 1) {
            System.out.println(sum);
            return;
        }

        sum(n - 1, sum += n);
    }

    public static int functionalRecursion(int n){
        if(n == 0) return 0 ;

        return n + functionalRecursion(n-1) ;
    }

    public static void main(String[] args) {

        System.out.print("Enter the first numbers of sum you want :");
        int n = new Scanner(System.in).nextInt();
        sum(n, 0);
        System.out.println(functionalRecursion(n));
    }
}
