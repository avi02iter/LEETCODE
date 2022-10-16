class Solution {

    public int longestCommonSubsequence(String text1, String text2) {
        int n = text1.length();
        int m = text2.length();
        int[][] dp = new int[n + 1][m + 1];
        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }

        return memo(n, m, text1, text2, dp);
    }

    public int memo(int n, int m, String a, String b, int[][] dp) {
        if (n == 0 || m == 0) {
            return 0;
        }
        if (dp[n][m] != -1) {
            return dp[n][m];
        }

        if (a.charAt(n - 1) == b.charAt(m - 1)) {
            dp[n][m] = 1 + memo(n - 1, m - 1, a, b, dp);
        } else {
            dp[n][m] = Math.max(memo(n - 1, m, a, b, dp), memo(n, m - 1, a, b, dp));
        }

        return dp[n][m];
    }
}
