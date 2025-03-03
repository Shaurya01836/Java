import java.util.Scanner;

public class SortedArray {

    static void SortArray(int arr[], int n) {

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n + 1; j++) {
                if (arr[j] > arr[i]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp; 
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n, num, largestElem;
        int arr[] = new int[20];
        System.out.print("Enter the size of array : ");
        n = s.nextInt();

        System.out.print("Enter the value : ");
        for (int i = 0; i < n; i++) {
            num = s.nextInt();
            arr[i] = num;
        }
        SortArray(arr, n);
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.print("\nEnter the rank of the largest element you want to see (e.g., 1 for largest): ");
        largestElem = s.nextInt();
        if (largestElem > 0 && largestElem <= n)
            System.out.println(arr[--largestElem]);
        else
            System.out.println("Invalid rank. Please enter a value between 1 and " + n);
        s.close();
    }

}
