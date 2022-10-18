class Solution {
    public int minInsertions(String s) {
         int n=s.length();
        String S="";
        for(int i=n-1;i>=0;i--){
            S+=s.charAt(i);
        }
        int m=S.length();
        int[][] dp=new int[n+1][m+1];
        for(int i=0;i<n+1;i++){
            for(int j=0;j<m+1;j++){
                if(i==0||j==0){
                    dp[i][j]=0;
                }else if(S.charAt(i-1)==s.charAt(j-1)){
                    dp[i][j]=1+dp[i-1][j-1];
                }else{
                    dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
                }
            }
        }
        return n-dp[n][m];
    }
}