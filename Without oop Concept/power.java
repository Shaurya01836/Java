import Exp.*;
import java.util.Scanner;

public class power {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        Power p = new Power();
        System.out.print("Enter a number : ");
        int a = scn.nextInt();
        System.out.print("Enter exponent for " + a + " : ");
        int b = scn.nextInt();
        p.power(a, b);

    }
}
