import java.util.Scanner;

public class PrimeRange {
    static boolean isPrime(int num) {
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    static void primeRange(int Range) {
        for (int i = 2; i < Range; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }

    }

    public static void main(String[] args) {
        int Range;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter Range : ");
        Range = s.nextInt();
        s.close();
        primeRange(Range);
    }
}
