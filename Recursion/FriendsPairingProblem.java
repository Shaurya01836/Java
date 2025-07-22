import java.util.Scanner;

public class FriendsPairingProblem {

    public static int totalWaysFriendsPairing(int n) {
        if (n == 1 || n == 2) {
            return n;
        }

        //single
        //int way1 = totalWaysFriendsPairing(n - 1);

        //pair
        //int way2 = (n-1) * totalWaysFriendsPairing(n - 2);

        //return way1 + way2;

        //simplified way of the above code
        return totalWaysFriendsPairing(n - 1) + (n - 1) * totalWaysFriendsPairing(n - 2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no of friends : ");
        int n = sc.nextInt();
        System.out.printf("So the total no of ways to pair the %d friends are : %d ", n, totalWaysFriendsPairing(n));
    }

}
