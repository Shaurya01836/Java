public class SpiralMatrix {

    public static void printSpiralMatrix(int arr[][]) {
        int startingRow = 0, endingRow = arr.length - 1, startingCol = 0, endingCol = arr[0].length - 1;

        while (startingRow <= endingRow && startingCol <= endingCol) {

            //top boundary
            for (int i = startingCol; i <= endingCol; i++) {
                System.out.print(arr[startingRow][i] + " ");
            }

            //right boundary
            for (int j = startingRow + 1; j <= endingRow; j++) {
                System.out.print(arr[j][endingCol] + " ");
            }

            //bottom boundary
            for (int i = endingCol - 1; i >= startingCol; i--) {
                if (startingRow == endingRow) {
                    break;
                }
                System.out.print(arr[endingRow][i] + " ");
            }

            //left boundary
            for (int j = endingRow - 1; j >= startingRow + 1; j--) {
                if (startingCol == endingCol) {
                    break;
                }
                System.out.print(arr[j][startingCol] + " ");
            }

            startingRow++;
            startingCol++;
            endingCol--;
            endingRow--;
        }
    }

    public static void main(String[] args) {
        int matrix[][] = {{1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16},};

        printSpiralMatrix(matrix);
    }
}
