//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;
class GfG {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int sum = sc.nextInt();
            int N = sc.nextInt();
            int coins[] = new int[N];
            for (int i = 0; i < N; i++) coins[i] = sc.nextInt();
            Solution ob = new Solution();
            System.out.println(ob.count(coins, N, sum));
        }
    }
}


// } Driver Code Ends


// User function Template for Java

class Solution {
    public long count(int coins[], int N, int sum) {
       //tabulation
     long[][] dp=new long[N+1][sum+1];
    //   for(int i=0;i<N+1;i++){
    //       for(int j=0;j<sum+1;j++){
    //           if(i<=0&&j!=0){
    //               dp[i][j]=0;
    //           }else if(j==0){
    //               dp[i][j]=1;
    //           }else if(coins[i-1]<=j){
    //               dp[i][j]=dp[i][j-coins[i-1]]+dp[i-1][j];
    //           }else {
    //               dp[i][j]=dp[i-1][j];
    //           }
    //       }
    //   }
    //   return dp[N][sum];
    
    //memo
    for(long[] row:dp){
        Arrays.fill(row,-1);
    }
    
    return memo(coins,N,sum,dp);
    }
    
    
    public long memo(int[] coins,int N,int sum,long[][] dp){
        if(N<=0&&sum!=0){
            return 0;
        }
        if(sum==0){
            return 1;
        }
        if(dp[N][sum]!=-1){
        return dp[N][sum];
    }
    
    if(coins[N-1]<=sum){
        dp[N][sum]=memo(coins,N,sum-coins[N-1],dp)+memo(coins,N-1,sum,dp);
    }else{
        dp[N][sum]=memo(coins,N-1,sum,dp);
    }
        return dp[N][sum];
        
    }
}