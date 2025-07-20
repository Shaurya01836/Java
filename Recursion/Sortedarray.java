import java.util.Scanner;

public class Sortedarray {

    public static boolean isSorted(int arr[], int i) {
        if (i == arr.length -1 ){
            return true;
        }
        if (arr[i] > arr[i+1]){
            return false;
        }

        return isSorted(arr, i+1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[5];
        System.out.print("Enter the elements of the array : ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(isSorted(arr, 0));

    }

}
