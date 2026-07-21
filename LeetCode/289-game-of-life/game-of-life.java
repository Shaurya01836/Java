class Solution {
    public void gameOfLife(int[][] board) {
        int m = board.length;
        int n = board[0].length;

        int mat[][] = new int[m][n];

        int[][] directions = {
                { -1, -1 }, { -1, 0 }, { -1, 1 },
                { 0, -1 }, { 0, 1 },
                { 1, -1 }, { 1, 0 }, { 1, 1 }
        };

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                int live = 0;

                for (int[] dir : directions) {

                    int newRow = i + dir[0];
                    int newCol = j + dir[1];

                    if (newRow >= 0 && newRow < m &&
                            newCol >= 0 && newCol < n) {

                        if (board[newRow][newCol] == 1) {
                            live++;
                        }
                    }
                }

                if (board[i][j] == 1) {
                    if (live < 2 || live > 3)
                        mat[i][j] = 0;
                    if (live == 2 || live == 3)
                        mat[i][j] = 1;
                } else {
                    if (live == 3)
                        mat[i][j] = 1;
                    else
                        mat[i][j] = 0;
                }

            }
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = mat[i][j] ; 
            }
        }
    }
}