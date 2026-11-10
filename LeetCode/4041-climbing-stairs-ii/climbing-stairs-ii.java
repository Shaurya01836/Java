
class Solution {

    int[] dp;

    int rec(int n, int[] costs, int i) {

        if (i == n) {
            return 0;
        }

        if (dp[i] != -1) {
            return dp[i];
        }

        int one = Integer.MAX_VALUE;
        int two = Integer.MAX_VALUE;
        int three = Integer.MAX_VALUE;

        if (i + 1 <= n) {
            one = costs[i] + 1
                + rec(n, costs, i + 1);
        }

        if (i + 2 <= n) {
            two = costs[i + 1] + 4
                + rec(n, costs, i + 2);
        }

        if (i + 3 <= n) {
            three = costs[i + 2] + 9
                + rec(n, costs, i + 3);
        }

        return dp[i] = Math.min(one, Math.min(two, three));
    }

    public int climbStairs(int n, int[] costs) {

        dp = new int[n];
        Arrays.fill(dp, -1);

        return rec(n, costs, 0);
    }
}
