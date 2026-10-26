class Solution {

    long dfs(int[][] grid, int k, int m, int n, boolean[][] visited) {

        if (m < 0 || m >= grid.length || n < 0 || n >= grid[0].length || visited[m][n] || 
                grid[m][n] == 0)
            return 0;

        visited[m][n] = true;

        //left
        long left = dfs(grid, k, m, n - 1, visited);

        //right
        long right = dfs(grid, k, m, n + 1, visited);

        //up
        long up = dfs(grid, k, m - 1, n, visited);

        //down
        long down = dfs(grid, k, m + 1, n, visited);

        return (grid[m][n] + left + right + up + down);
    }

    public int countIslands(int[][] grid, int k) {

        int m = grid.length, n = grid[0].length;
        boolean[][] visited = new boolean[m][n];
        int res = 0;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (!visited[i][j] && grid[i][j] != 0) {
                    if ((dfs(grid, k, i, j, visited)) % k == 0)
                        res++;
                }
            }
        }

        return res;
    }
}