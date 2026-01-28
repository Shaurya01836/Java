package BitManipulation;

import java.util.Scanner;

public class NumberOfSetBits {

    public static void main(String[] args) {

        System.out.print("Enter a number :");
        int num = new Scanner(System.in).nextInt();

        int cnt = 0;
        while (num > 0) {
            num = num & (num - 1);
            cnt++;
        }

        System.out.println("Number of set bits :" + cnt);

    }
}
