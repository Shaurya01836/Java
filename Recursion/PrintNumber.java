import java.util.Scanner;

public class PrintNumber {


    //decreasing order
    public static void printNum(int num) {
        if (num == 0) {
            return;
        }
        System.out.print(num + " ");
        printNum(num - 1);
    }

    //increasing order
    public static void printNumIncreasingOrder(int num) {
        if (num == 0) {
            return;
        }
        printNumIncreasingOrder(num - 1);
        System.out.print(num + " ");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = sc.nextInt();
        printNum(num);
        System.out.println();
        printNumIncreasingOrder(num);
    }

}
