class Solution {

    int res;
    Set<Integer>[][] dp;

    void rec(int[][] grid, int m, int n, int xor) {

        if (m >= grid.length || n >= grid[0].length) {
            return;
        }

        xor ^= grid[m][n];

        if (dp[m][n].contains(xor)) {
            return;
        }

        dp[m][n].add(xor);

        if (m == grid.length - 1 && n == grid[0].length - 1) {
            res = Math.min(res, xor);
            return;
        }

        rec(grid, m, n + 1, xor);
        rec(grid, m + 1, n, xor);
    }

    public int minCost(int[][] grid) {

        int m = grid.length , n = grid[0].length;

        dp = new HashSet[m][n];
        res = Integer.MAX_VALUE;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                dp[i][j] = new HashSet<>();
            }
        }

        rec(grid, 0, 0, 0);

        return res;
    }
}