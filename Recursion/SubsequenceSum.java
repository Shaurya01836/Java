package Recursion;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SubsequenceSum {


    //find all the subsequence
    static void findSubsequenceWithSumK(int[] arr, int i, List<Integer> list, int k, int sum) {
        if (i >= arr.length) {
            if (sum == k) {
                System.out.println(list);
            }
            return;
        }

        list.add(arr[i]);
        sum += arr[i];
        findSubsequenceWithSumK(arr, i + 1, list, k, sum);
        list.removeLast();
        sum -= arr[i];
        findSubsequenceWithSumK(arr, i + 1, list, k, sum);
    }

    //find only one subsequence
    static boolean SubsequenceWithSumK(int[] arr, int i, List<Integer> list, int k, int sum) {
        if (i >= arr.length) {
            if (sum == k) {
                System.out.println(list);
                return true;
            }
            return false;
        }

        list.add(arr[i]);
        sum += arr[i];
        boolean a = SubsequenceWithSumK(arr, i + 1, list, k, sum);
        if (a) return true;
        list.removeLast();
        sum -= arr[i];
        return SubsequenceWithSumK(arr, i + 1, list, k, sum);
    }

    // no of subsequences
    static int noOfSubsequences(int[] arr, int i, int k, int sum) {
        if (i >= arr.length) {
            if (sum == k) return 1;
            else return 0;
        }

        sum += arr[i];
        int l = noOfSubsequences(arr, i + 1, k, sum);

        sum -= arr[i];
        int r = noOfSubsequences(arr, i + 1, k, sum);

        return l + r;
    }


    public static void main(String[] args) {
        int[] arr = {1, 2, 1};
        List<Integer> list = new ArrayList<>();

        System.out.print("Enter the sum target :");

        int k = new Scanner(System.in).nextInt();

        System.out.println("All subsequences whose sum is " + k);
        findSubsequenceWithSumK(arr, 0, list, k, 0);
        System.out.println();

        list.clear();
        System.out.println("Only one subsequences whose sum is " + k);
        SubsequenceWithSumK(arr, 0, list, k, 0);

        System.out.println("Number of Subsequences for the target " + k + " are " + noOfSubsequences(arr, 0, k, 0));
    }

}
