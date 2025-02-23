// Write a program that reads a set of integers,and then prints the sum of the
// even and odd integers

import java.util.Scanner;

public class Ques6 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter how many numbers you want : ");
        int n, num, sum = 0;
        n = s.nextInt();
        int[] arr = new int[20];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter the Number : ");
            num = s.nextInt();
            arr[i] = num;
            sum += num;
        }
        System.out.println("Sum is : " + sum);
        s.close();
    }
}
