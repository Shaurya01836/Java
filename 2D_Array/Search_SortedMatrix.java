//staircase search

import java.util.Scanner;

public class Search_SortedMatrix {

    public static boolean staircaseSearch(int arr[][], int key) {

        int row = 0, col = arr[0].length - 1;

        while (row < arr.length && col >= 0) {
            if (arr[row][col] == key) {
                return true;
            }
            //left side move
            else if (arr[row][col] > key) {
                col--;
            }
            //downside move
            else {
                row++;
            }

        }
        return false;
    }

    public static boolean staircaseSearch1(int arr[][], int key) {

        int row = arr.length - 1, col = 0;

        while (row >= 0 && col < arr[0].length) {
            if (arr[row][col] == key) {
                return true;
            }
            //
            else if (arr[row][col] > key) {
                row--;
            }
            //
            else {
                col++;
            }

        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int matrix[][] = {
                {10, 20, 30, 40},
                {15, 25, 35, 45},
                {27, 29, 37, 48},
                {32, 33, 39, 50}
        };

        System.out.print("Enter the number you want to search : ");
        int num = sc.nextInt();

        if (staircaseSearch1(matrix, num)) {
            System.out.println("Number is found in the array");
        } else {
            System.out.println("Number is not found in the array");
        }
    }
}
