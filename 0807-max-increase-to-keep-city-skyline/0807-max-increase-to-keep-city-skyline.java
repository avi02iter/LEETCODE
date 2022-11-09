class Solution {

    public int maxIncreaseKeepingSkyline(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int[] row = new int[n];
        int[] col = new int[m];

        for (int i = 0; i < n; i++) {
            int max1=0;
                int max2=0;
            for (int j = 0; j < m; j++) {
                
                max1 = Math.max(max1, grid[i][j]);
                max2 = Math.max(max2, grid[j][i]);
            }
            row[i] = max1;
            col[i] = max2;
        }
        int sum = 0;

        for (int i = 0; i < row.length; i++) {
            for (int j = 0; j < col.length; j++) {
                sum += Math.min(row[i], col[j]) - grid[i][j];
            }
        }

        return sum;
    }
}
