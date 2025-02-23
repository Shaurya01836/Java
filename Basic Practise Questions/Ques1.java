// In a program,input3 numbers :A,B and C.You have to output the average of these 3 numbers.
// (Hint : Average of N numbers is sum of those numbers divided by N)

import java.util.Scanner;

class Ques1 {

    public static void main(String[] args) {
        int a, b, c;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the first number :");
        a = s.nextInt();
        System.out.print("Enter the second number :");
        b = s.nextInt();
        System.out.print("Enter the third number :");
        c = s.nextInt();
        System.out.println("The average of the three numbers is " + (a + b + c) / 3);
        s.close();
    }

}