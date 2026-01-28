package BitManipulation;

import java.util.Scanner;

public class SetIthBit {

    static int clearIthBit(int num, int i) {
        num = num & (~(1 << i));
        return num;
    }

    static int toggleIthBit(int num, int i) {
        return num ^ (1 << i);
    }

    static int removeLastSetBit(int num) {
       num = num & (num -1) ;
       return num ;
    }

    public static void main(String[] args) {
        System.out.print("Enter a number :");
        int num = new Scanner(System.in).nextInt();
        System.out.println("Into Binary form : " + Integer.toBinaryString(num));
        System.out.print("Enter the ith bit that you want to set :");
        int i = new Scanner(System.in).nextInt();

        num = num | (1 << i);
        System.out.println("Into Binary form : " + Integer.toBinaryString(num));

        System.out.print("Enter the ith bit that you want to unset :");
        i = new Scanner(System.in).nextInt();

        System.out.println("Into Binary form : " + Integer.toBinaryString(clearIthBit(num, i)));

        System.out.print("Enter the ith bit that you want to toggle :");
        i = new Scanner(System.in).nextInt();

        System.out.println("Into Binary form : " + Integer.toBinaryString(toggleIthBit(num, i)));

        num = removeLastSetBit(num);

        System.out.println("Into Binary form after unsetting last set bit: " + Integer.toBinaryString(removeLastSetBit(num)));

    }

}
