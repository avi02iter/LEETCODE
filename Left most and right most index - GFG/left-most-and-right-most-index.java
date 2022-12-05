//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

class pair  {  
    long first, second;  
    public pair(long first, long second)  
    {  
        this.first = first;  
        this.second = second;  
    }  
}

class GFG {
	public static void main(String[] args) throws IOException
	{
	        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t =
            Integer.parseInt(br.readLine().trim()); // Inputting the testcases
        while(t-->0)
        {
            long n = Long.parseLong(br.readLine().trim());
            long a[] = new long[(int)(n)];
            // long getAnswer[] = new long[(int)(n)];
            String inputLine[] = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                a[i] = Long.parseLong(inputLine[i]);
            }
            long k = Long.parseLong(br.readLine().trim());
            
            Solution obj = new Solution();
            pair ans = obj.indexes(a, k);
            if (ans.first == -1 && ans.second == -1)
                System.out.println(-1);
            else
                System.out.println(ans.first+" "+ans.second);
            
        }
	}
}


// } Driver Code Ends


//User function Template for Java

/*
class pair  {  
    long first, second;  
    public pair(long first, long second)  
    {  
        this.first = first;  
        this.second = second;  
    }  
}
*/

class Solution {
    
    public pair indexes(long v[], long x)
    {
        int n=v.length;
        int f=binaryfirst(v,x,n);
        int l=binarylast(v,x,n);
        
        return new pair(f,l);
    }
    
    public int binaryfirst(long[] v,long x,int n){
        int start=0;
        int end=n-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(v[mid]==x){
               if(mid-1>=0&&v[mid-1]==x){
                   end=mid-1;
               }else{
                   return mid;
               }
            }else if(v[mid]<x){
               start=mid+1;
            }else{
               end=mid-1;
            }
        }
        return -1;
    }
     public int binarylast(long[] v,long x,int n){
        int start=0;
        int end=n-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(v[mid]==x){
               if(mid+1<v.length&&v[mid+1]==x){
                   start=mid+1;
               }else{
                   return mid;
               }
            }else if(v[mid]>x){
              end=mid-1;
            }else{
                start=mid+1;
            }
        }
        return -1;
    }
}