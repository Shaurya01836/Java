import java.util.Scanner;

public class TilingProblem {

    public static int noOfWays(int n) {
        //base case if n is 0 or 1 for 2xn floor
        if (n == 0 || n == 1) {
            return 1;
        }

        //vertical tiles
        int way1 = noOfWays(n - 1);

        //horizontal tiles
        int way2 = noOfWays(n - 2);

        return way1 + way2;
    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the n of the floor : ");
        int n = sc.nextInt();
        System.out.println("No of ways to fill this floor with 2x1 size of tile are : " + noOfWays(n));
    }

}
