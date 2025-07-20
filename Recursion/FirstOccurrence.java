import java.lang.foreign.StructLayout;
import java.util.Scanner;

public class FirstOccurrence {

    public static int keyFirstOccurrence(int arr[], int i, int key) {
        if (i == arr.length) {
            return -1;
        }
        if (arr[i] == key) {
            return i;
        }
        return keyFirstOccurrence(arr, i + 1, key);
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
        System.out.println(keyFirstOccurrence(arr, 0, key));
    }

}
