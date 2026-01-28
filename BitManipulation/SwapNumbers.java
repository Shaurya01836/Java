package BitManipulation;

import java.util.Scanner;

public class SwapNumbers {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number a : ");
        int a = sc.nextInt();
        System.out.print("Enter number b : ");
        int b = sc.nextInt();

        //swapping by using xor operator
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        System.out.println("a:" + a + "  b:" + b);
    }
}
