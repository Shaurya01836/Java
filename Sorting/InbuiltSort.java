import java.util.*;

public class InbuiltSort {

    public static <T> void printArr(T arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int arr[] = {5, 2, 4, 3, 1};
        Integer arr1[] = {5, 2, 4, 3, 1};
        System.out.print("Array before Sorting : ");
        printArr(arr);
        System.out.println();
        System.out.print("Array after Sorting : ");
        Arrays.sort(arr);
        //Arrays.sort(arr, 0, 5);
        printArr(arr);

        //for reverse order
        System.out.println();
        System.out.print("Array after Sorting in reverse order : ");
        Arrays.sort(arr1, Collections.reverseOrder());
        printArr(arr1);
    }
}
