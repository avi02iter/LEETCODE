//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG{
    public static void main(String args[])throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while(t-- > 0){
            int N = Integer.parseInt(in.readLine());
            String input_line[] = in.readLine().trim().split("\\s+");
            int arr[] = new int[N];
            for(int i = 0;i < N;i++)
                arr[i] = Integer.parseInt(input_line[i]);
            
            Solution ob = new Solution();
            int x = ob.equalPartition(N, arr);
            if(x == 1)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution{
    static int equalPartition(int N, int arr[])
    {
        //tabulation
        // int sum=0;
        // for(int i=0;i<N;i++){
        //     sum+=arr[i];
        // }
      
        // if(sum%2==0){
        //     int sum2=sum/2;
        //   int[][] dp=new int[N+1][sum2+1];
        //   for(int i=0;i<N+1;i++){
        //       for(int j=0;j<sum2+1;j++){
        //           if(i==0&&j>0){
        //               dp[i][j]=0;
        //           }else if(j==0){
        //               dp[i][j]=1;
        //           }else if(arr[i-1]<=j){
        //               dp[i][j]=dp[i-1][j-arr[i-1]]|dp[i-1][j];
        //           }else{
        //               dp[i][j]=dp[i-1][j];
        //           }
        //       }
        //   }
        
        // return dp[N][sum2];
        
        // }
        
        
        // return 0;
        
        //memoization
        
        int sum=0;
        for(int i=0;i<N;i++){
            sum+=arr[i];
        }
        if(sum%2==0){
          int sum2=sum/2;
          int[][] dp=new int[N+1][sum2+1];
          for(int[] row:dp){
              Arrays.fill(row,-1);
          }
          int ans=memoiz(N-1,arr,sum2,dp);
          return ans;
         
        }
        
        
        return 0;
       
    }
    
    static int memoiz(int N,int[] arr,int sum2,int[][] dp){
        if(N<=0&&sum2!=0){
            return 0;
        }
        if(sum2==0){
            return 1;
        }
        
        if(dp[N][sum2]!=-1){
            return dp[N][sum2];
        }
        if(arr[N]<=sum2){
            return dp[N][sum2]=memoiz(N-1,arr,sum2-arr[N],dp)|memoiz(N-1,arr,sum2,dp);
            
        }
        return dp[N][sum2]=memoiz(N-1,arr,sum2,dp);
      
        
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}