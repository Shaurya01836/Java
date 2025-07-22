//Problem Statement 📝
//For a given integer array of size N, you have to find all the occurrences (indices) of a given element (Key) and
//print them. Use a recursive function to solve this problem.

//Sample Input:
//arr[] = {3, 2, 4, 5, 6, 2, 7, 2, 2}
//key = 2

//Sample Output: 1 5 7 8

import java.util.Scanner;

public class PracticeProblem1 {

    public static void allOccurrences(int arr[], int i, int key) {
        if (i == arr.length) {
            return;
        }

        if (arr[i] == key) {
            System.out.print(i + " ");
        }
        allOccurrences(arr, i + 1, key);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[5];
        System.out.print("Enter the elements of the array : ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("\nArray : ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.print("Enter the number you want to search in an array : ");
        int key = sc.nextInt();
        allOccurrences(arr, 0, key);
    }

}
