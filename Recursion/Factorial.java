import java.util.Scanner;

public class Factorial {

    public static int factorialOfANumber(int num) {

        if (num == 0) {
            return 1;
        }


//        int result = num * factorialOfANumber(num - 1);
//        return result;

        return num * factorialOfANumber(num - 1);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = sc.nextInt();
        System.out.printf("Factorial of %d is %d ", num, factorialOfANumber(num));

    }


}
