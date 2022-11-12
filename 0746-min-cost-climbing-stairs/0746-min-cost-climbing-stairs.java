class Solution {

    public int minCostClimbingStairs(int[] cost) {
        int n = cost.length;
        int[] dp = new int[n + 1];
        Arrays.fill(dp, -1);
        return cost(cost, dp, n);
    }

    public int cost(int[] cost, int[] dp, int n) {
        if (n == 0 || n == 1) {
            return 0;
        }
        if (n < 0) {
            return 0;
        }
        if (dp[n] != -1) {
            return dp[n];
        }

        dp[n] = Math.min(cost[n - 1] + cost(cost, dp, n - 1), cost[n - 2] + cost(cost, dp, n - 2));

        return dp[n];
    }
}
