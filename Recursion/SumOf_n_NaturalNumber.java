import java.util.Scanner;

public class SumOf_n_NaturalNumber {

    public static int sumOfNaturalNumbers(int num) {

        if (num <= 0) {
            return -1;
        }
        if (num == 1) {
            return 1;
        }

        return num + sumOfNaturalNumbers(num - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = sc.nextInt();
        if (sumOfNaturalNumbers(num) > 0) {
            System.out.printf("sum of %d natural numbers is %d ", num, sumOfNaturalNumbers(num));
        }else{
            System.out.println("Wrong input !");
        }

    }

}
