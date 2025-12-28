package Backtracking;

public class BacktrackingOnArray {


    public static void printArray(int[] arr) {
        for (int j : arr) {
            System.out.print(j + " ");
        }
        System.out.println();
    }

    public static void changeArray(int[] arr, int i, int value) {

        if (i == arr.length) {
            printArray(arr);
            return;
        }

        arr[i] = value;
        changeArray(arr, i+ 1, value+1 );
        arr[i] -= 2;
    }


    public static void main(String[] args) {
        int[] arr = new int[5];
        changeArray(arr, 0, 1);
        printArray(arr);

    }


}
