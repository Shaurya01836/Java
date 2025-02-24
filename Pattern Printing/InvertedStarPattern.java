import java.util.Scanner;

public class InvertedStarPattern {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a;
        System.out.print("Enter a number :");
        a = s.nextInt();
        s.close();
        for (int i = 1; i <= a; i++) {
            for (int j = 1; j <= (a - i) + 1; j++) {
                System.out.print("* ");
            }
            System.out.print("\n");
        }
    }
}
