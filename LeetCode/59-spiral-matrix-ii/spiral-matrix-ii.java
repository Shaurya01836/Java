class Solution {
    public int[][] generateMatrix(int n) {

        int[][] res = new int[n][n];

        int startingRow = 0, endingRow = n - 1, startingCol = 0,
                endingCol = n - 1;
        int num = 1;

        while (startingRow <= endingRow && startingCol <= endingCol) {
            //top 
            for (int i = startingCol; i <= endingCol; i++) {
                res[startingRow][i] = num;
                num++;

            }

            //right 
            for (int j = startingRow + 1; j <= endingRow; j++) {
                res[j][endingCol] = num;
                num++;
            }

            //bottom 
            for (int k = endingCol - 1; k >= startingCol; k--) {
                if (startingRow == endingRow) {
                    break;
                }
                res[endingRow][k] = num ; 
                num ++ ; 
                
            }

            //left 
            for (int l = endingRow - 1; l >= startingRow + 1; l--) {
                if (startingCol == endingCol) {
                    break;
                }
                res[l][startingCol] = num ; 
                num++ ; 
            }
            startingRow++;
            endingRow--;
            startingCol++;
            endingCol--;
        }
        return res;
    }
}