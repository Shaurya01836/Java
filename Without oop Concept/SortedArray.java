import java.util.Scanner;

public class SortedArray {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n, num;
        int arr[] = new int[20];
        System.out.print("Enter the size of array : ");
        n = s.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print("Enter the value : ");
            num = s.nextInt();
            arr[i] = num;
        }
        s.close();

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n + 1; j++) {
                if (arr[j] > arr[i]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

    }
}
