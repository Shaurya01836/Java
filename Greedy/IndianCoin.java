package Greedy;

import java.util.Arrays;

public class IndianCoin {

    static  int change(int[] coins, int amount) {
        Arrays.sort(coins);
        int count = 0;


        for (int i = coins.length - 1; i >= 0; i--) {
            if (amount == 0) return count;
            else if (amount < 0) return -1;

            while (coins[i] <= amount) {
                amount -= coins[i];
                count++;
            }
        }

        if (amount != 0) return -1;
        return count;

    }

    public static void main(String[] args) {
        int[] Coins = {1, 2, 5, 10, 20, 50, 100, 500, 2000};

        int res = change(Coins , 5204) ;

        System.out.println("Result is " + res);
    }

}
