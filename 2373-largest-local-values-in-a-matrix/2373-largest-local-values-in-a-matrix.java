class Solution {
    public int[][] largestLocal(int[][] grid) {
        int n=grid.length;
       int[][] m=new int[n-2][n-2];
      for(int i=0;i<m.length;i++){
          for(int j=0;j<m[i].length;j++){
              m[i][j]=maxx(grid,i,j);
          }
      }
        return m;
    }
    public int maxx(int[][] grid,int l,int r){
        int max=Integer.MIN_VALUE;
      for(int i=l;i<l+3;i++){
          for(int j=r;j<r+3;j++){
              max=Math.max(max,grid[i][j]);
          }
      }
        
        return max;
    }
}