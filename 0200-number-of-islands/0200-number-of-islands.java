class Solution {

    public int numIslands(char[][] grid) {
        int count = 0;
        int n = grid.length;
        int m = grid[0].length;
        boolean[][] vis = new boolean[n][m];
        for (boolean[] row : vis) {
            Arrays.fill(row, false);
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (grid[i][j] == '1' && vis[i][j] == false) {
                    helper(grid, i, j, vis);
                    count++;
                }
            }
        }

        return count;
    }

    public void helper(char[][] grid, int i, int j, boolean[][] vis) {
        if (i < 0 || j < 0 || i >= grid.length || j >= grid[0].length || vis[i][j] == true || grid[i][j] == '0') {
            return;
        }
        vis[i][j] = true;
        helper(grid, i - 1, j, vis);
        helper(grid, i, j + 1, vis);
        helper(grid, i + 1, j, vis);
        helper(grid, i, j - 1, vis);
    }
}
