package Recursion;

import java.util.Scanner;

public class Fibonacci {


    static int fibonacci(int num) {
        if (num <= 1) return num;

//        int l = fibonacci(num - 1);
//        int r = fibonacci(num - 2);

        return fibonacci(num-1) + fibonacci(num-2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = sc.nextInt();
        System.out.println(fibonacci(num));
    }
}
