import java.util.Scanner;

public class Power {

    public static int powerOfNumber(int num, int power) {
        if (power == 0) {
            return 1;
        }
        return num * powerOfNumber(num, power - 1);

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
