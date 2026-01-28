package BitManipulation;

import java.util.Scanner;

public class PowerOf2 {

    public static void main(String[] args) {
        System.out.print("Enter a num to check :");
        int num = new Scanner(System.in).nextInt();

        num = num & (num - 1);
        if (num == 0) System.out.println("Number is power of 2");
        else System.out.println("Number is not of power of 2");
    }

}
