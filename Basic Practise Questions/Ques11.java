// Search about(Google) & use the following methods of the Math class in Java:
// a. Math.min( )
// b. Math.max( )
// c. Math.sqrt( )
// d. Math.pow( )
// e. Math.avg( )
// f. Math.abs( ) Returns the absolute (positive) value of a number.

import java.util.Scanner;

public class Ques11 {
    public static void main(String[] args) {
        int a, b;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter number a : ");
        a = s.nextInt();
        System.out.print("Enter number b : ");
        b = s.nextInt();
        s.close();
        System.out.println("Min between " + a + " & " + b + " is : " + Math.min(a, b));
        System.out.println("Max between " + a + " & " + b + " is : " + Math.max(a, b));
        System.out.println("Sqrt of " + a + " is : " + Math.sqrt(a));
        System.out.println("Power is : " + Math.pow(a, b));
        System.out.println("Positive value : " + Math.abs(a));

    }
}
