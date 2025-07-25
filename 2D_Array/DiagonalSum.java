public class DiagonalSum {


    public static int diagonalSum(int arr[][]) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {

            //for the primary diagonal
            sum += arr[i][i];

            //for the secondary diagonal
            sum += arr[i][arr.length - 1 - i];
        }
        return sum;
    }

    public static void main(String[] args) {
        int matrix[][] = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16},};
        System.out.println(diagonalSum(matrix));
    }
}
