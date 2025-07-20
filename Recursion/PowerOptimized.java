import java.util.Scanner;

public class PowerOptimized {


    public static int powerOfNumber(int num, int power) {
        if (power == 0) {
            return 1;
        }

        // for even power
        int halfPower = powerOfNumber(num, power / 2);
        int halfPowersq = halfPower * halfPower;

        // for odd power
        if (power % 2 != 0) {
            halfPowersq = num * halfPowersq;
        }
        return halfPowersq;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num = sc.nextInt();
        System.out.print("Enter the power : ");
        int power = sc.nextInt();
        System.out.println(powerOfNumber(num, power));
    }

}
