import java.util.*;

public class Array1 {
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
            System.out.print(arr[i] + " ");
        }

    }
}
