//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG{
    public static void main(String args[])throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while(t-- > 0){
            String str = in.readLine();
            Solution ob = new Solution();
            System.out.println(ob.palindromicPartition(str));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution{
    static int palindromicPartition(String str)
    {
        int n=str.length();
        int[][] dp=new int[501][501];
        for(int[] row:dp){
            Arrays.fill(row,-1);
        }
        return part(str,0,n-1,dp);
       
    }
    
    static int part(String str,int i,int j,int[][] dp){
        if(i>=j){
            return 0;
        }
        int min=Integer.MAX_VALUE;
        if(pallindrome(str,i,j)){
            return 0;
            }
            
            if(dp[i][j]!=-1){
                return dp[i][j];
            }
            for(int k=i;k<=j-1;k++){
                int temp=1+part(str,i,k,dp)+part(str,k+1,j,dp);
                
             if(temp<min){
                 min=temp;
             }
            }
        
        return dp[i][j]=min;
        
    }
    
    static boolean pallindrome(String s,int i,int j){
        while(i<j){
            if(s.charAt(i)==s.charAt(j)){
                i++;
                j--;
            }else{
                return false;
            }
            
           
        }
        
        return true;
    }
}