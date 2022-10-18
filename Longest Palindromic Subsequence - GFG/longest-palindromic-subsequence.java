//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GfG
{
    public static void main(String args[])
        {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while(t-->0)
                {
                    String s = sc.next();
                    Solution obj = new Solution();
                    System.out.println(obj.longestPalinSubseq(s));
                }
                
        }
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
    public int longestPalinSubseq(String S)
    {
        String s1="";
      int n=S.length();
      for(int i=n-1;i>=0;i--){
        s1+=S.charAt(i);  
      }
     
      int m=s1.length();
      int[][] dp=new int[n+1][m+1];
      for(int i=0;i<n+1;i++){
          for(int j=0;j<m+1;j++){
              if(i==0||j==0){
                  dp[i][j]=0;
              }else if(S.charAt(i-1)==s1.charAt(j-1)){
                  dp[i][j]=1+dp[i-1][j-1];
              }else{
                  dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
              }
          }
      }
      
      return dp[n][m];
    }
}