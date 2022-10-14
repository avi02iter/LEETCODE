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
                    int n = sc.nextInt();
                    int A[] = new int[n];
                    for(int i = 0;i<n;i++)
                        A[i] = sc.nextInt();
                    Solution ob = new Solution();
                    System.out.println(ob.minDifference(A,n));
                }
        }
}    
// } Driver Code Ends


//User function Template for Java

class Solution
{

	public int minDifference(int arr[], int n) 
	{ 
	  int range=0;
	  for(int i=0;i<n;i++){
	      range+=arr[i];
	  }
	  boolean[][] dp=new boolean[n+1][range+1];
	  
	 return tabulation(arr,n,range,dp);
	   
	} 
	public static int tabulation(int[] arr,int n,int range,boolean[][] dp){
	    for(int i=0;i<n+1;i++){
	        for(int j=0;j<range+1;j++){
	            if(i<=0&&j!=0){
	                dp[i][j]=false;
	            }else if(j==0){
	                dp[i][j]=true;
	            }else if(arr[i-1]<=j){
	                dp[i][j]=dp[i-1][j-arr[i-1]]||dp[i-1][j];
	            }else{
	                dp[i][j]=dp[i-1][j];
	            }
	            
	        }
	        
	    }
	        int min=Integer.MAX_VALUE;
	        for(int i=0;i<=range/2;i++){
	            if(dp[n][i]==true){
	                min=Math.min(min,range-2*i);
	            }
	        }
	    
	    return min;
	}

}
