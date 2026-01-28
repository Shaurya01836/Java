package BitManipulation;

import java.util.Scanner;

public class ithBitSetOrNot {

    public static void main(String[] args) {
        System.out.print("Enter a number :");
        int num = new Scanner(System.in).nextInt();
        System.out.println("Into Binary form : " + Integer.toBinaryString(num));
        System.out.print("Enter the ith bit that you have to check is it set or not :");
        int i = new Scanner(System.in).nextInt() ;


        int n = num & (1 << i) ;
        if(n != 0){
            System.out.println("ith bit is set");
        }else {
            System.out.println("ith bit is not set");
        }
    }
}
