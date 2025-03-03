// You are given an array prices where prices[i] is the price of a given stock on 
// the ith day. 
// Return the maximum profit you can achieve from this transaction. If you cannot 
// achieve any profit, return 0.
// Example 1: 
// Input: 
// prices = [7, 1, 5, 3, 6, 4] 
// Output: 5 
// Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5. 
// Note that buying on day 2 and selling on day 1 is not allowed because 
// you must buy before you sell. 

import java.util.Scanner;

public class Ques14 {
    static int MaxProfit(int array[]) {
        int CurrProfit = 0, MaxProfit = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] < array[j]) {
                    CurrProfit = array[j] - array[i];
                }
            }
            if (CurrProfit > MaxProfit) {
                MaxProfit = CurrProfit;
            }

        }
        if (MaxProfit < 0) {
            return 0;
        } else {
            return MaxProfit;
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num;
        int array[] = new int[5];
        System.out.print("Enter number :");
        for (int i = 0; i < array.length; i++) {
            num = s.nextInt();
            array[i] = num;
        }
        s.close();
        int result = MaxProfit(array);
        System.out.println("Max Profit is : " + result);
    }
}
