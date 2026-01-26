package Recursion;

public class ReverseArray {

    static void reverseArray(int[] arr, int l, int r) {
        if (l == r) return;

        int temp = arr[l];
        arr[l] = arr[r];
        arr[r] = temp;

        reverseArray(arr, ++l, --r);

    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.print("Original Array : ");
        for(int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
        reverseArray(arr, 0, arr.length - 1);
        System.out.print("Reversed Array : ");
        for(int i : arr) {
            System.out.print(i + " ");
        }
    }

}
