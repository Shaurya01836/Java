import java.util.Scanner;

public class BinaryStringProblem {

    public static void printBinaryString(int n, int lastPlace, String string) {
        if (n == 0) {
            System.out.println(string);
            return;
        }

        printBinaryString(n - 1, 0, string + "0");
        if (lastPlace == 0) {
            printBinaryString(n - 1, 1, string + "1");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the n : ");
        int n = sc.nextInt();
        String string = new String();
        printBinaryString(n, 0, string);
    }
}
