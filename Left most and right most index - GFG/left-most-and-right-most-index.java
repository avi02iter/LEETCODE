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
    
    public pair indexes(long v[], long x){
    int n=v.length;
    
        int f=first(v,0,x);
        int l=last(v,0,x);
        return new pair(f,l);
    }
    public int first(long[] v,int idx,long x){
      if(idx==v.length){
          return -1;
      }
      if(v[idx]==x){
          return idx;
      }else{
           int fissa=first(v,idx+1,x);
           return fissa;
      }
     
      
      }
    
    
        
        
    
    
    
     public int last(long[] v,int idx,long x){
    if(idx==v.length){
        return -1;
        }
        int lissa=last(v,idx+1,x);
        if(lissa==-1){
            if(v[idx]==x){
                return idx;
            }else{
                return -1;
            }
        }else{
            return lissa;
        }
    
    
        
        
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}