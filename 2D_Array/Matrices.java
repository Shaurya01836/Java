import java.util.Scanner;

public class Matrices {

    public static boolean search(int arr[][], int num) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (arr[i][j] == num) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int arr[][] = new int[3][3];
//        arr.length - no of rows;
//        arr[0].length - no of columns ;

        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.printf("Enter the value for : arr[%d][%d] : ", i, j);
                arr[i][j] = sc.nextInt();
            }
        }

        // for printing the 2d array
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        // for searching an element in 2d array
        System.out.print("Enter the number you want to find in the array : ");
        int num = sc.nextInt();
        if (search(arr, num)) {
            System.out.println("Number found in the array");
        } else {
            System.out.println("Number not found in the array");
        }

    }
}
