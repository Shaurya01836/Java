//Write a program to FindTranspose of a Matrix . What is Transpose?
// Transpose of a matrix is the process of swapping the rows to
//columns. For a 2x3 matrix,Matrix
// a11 a12 a13
// a21 a22 a23
// Transposed Matrix
// a11 a21
// a12 a22
// a13 a23

public class practiceQuestion3 {

    public static void printMatrix(int matrix[][]) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void transposeMatrix(int matrix[][], int transposedMatrix[][]) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                transposedMatrix[j][i] = matrix[i][j];
            }
        }
    }

    public static void main(String[] args) {
        int[][] matrix = {{2, 3, 7}, {5, 6, 7}};
        int[][] transposedMatrix = new int[matrix[0].length][matrix.length];
        transposeMatrix(matrix, transposedMatrix);
        System.out.println("Original Matrix : ");
        printMatrix(matrix);
        System.out.println("Transposed Matrix : ");
        printMatrix(transposedMatrix);

    }
}
