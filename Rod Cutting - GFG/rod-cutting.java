//{ Driver Code Starts
import java.io.*;
import java.util.*;

class RodCutting {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) arr[i] = sc.nextInt();

            Solution ob = new Solution();
            System.out.println(ob.cutRod(arr, n));
        }
    }
}

// } Driver Code Ends


class Solution{
    public int cutRod(int price[], int n) {
       //tabulation
      int[] length=new int[n+1];     //basically act as array or value in knapsack
     int m=length.length;        // act as n in knapsack
      for(int i=0;i<length.length;i++){  
         length[i]=i+1;  
     }
     int[][] dp=new int[m+1][n+1];      //act as n as sum in knapsack
    //  for(int i=0;i<m+1;i++){
    //      for(int j=0;j<n+1;j++){
    //          if(i==0||j==0){
    //              dp[i][j]=0;
    //          }else if(length[i-1]<=j){
    //              dp[i][j]=Math.max(price[i-1]+dp[i][j-length[i-1]],dp[i-1][j]);
    //          }else{
    //              dp[i][j]=dp[i-1][j];
    //          }
    //      }
    //  }
    //  return dp[m][n];
    
    //memoization
    for(int[] row:dp){
        Arrays.fill(row,-1);
    }
     return memo(price,m,n,dp,length);     //here n is total weight W in knapsack
     
    }
    public int memo(int[] price,int m,int n,int[][] dp,int[] length){
        if(m==0||n==0){
            return 0;
        }
        if(dp[m][n]!=-1){
            return dp[m][n];
        }
        if(length[m-1]<=n){
            dp[m][n]=Math.max(price[m-1]+memo(price,m,n-length[m-1],dp,length),memo(price,m-1,n,dp,length));
            
            
        }else{
             dp[m][n]=memo(price,m-1,n,dp,length);
        }
        
        
        return dp[m][n];
        
    }
}