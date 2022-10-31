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
            int N = Integer.parseInt(in.readLine());
            String S = in.readLine();
            
            Solution ob = new Solution();
            System.out.println(ob.countWays(N, S));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution{
    static HashMap<String,Integer> hm=new HashMap<>();
    static int countWays(int N, String S){
        // code here
        hm.clear();
        return memoizedEvaluateTrue(S,0,N-1,true);
    }
    public static int memoizedEvaluateTrue(String s,int i,int j,boolean isTrue){
        if(i>j) return 0;
        if(i==j){
            if(isTrue)
            return s.charAt(i)=='T'?1:0;
            else return s.charAt(i)=='F'?1:0;
        }
        String check=i+" "+j+" "+isTrue;
        if(hm.containsKey(check))
            return hm.get(check);
        int ans=0;
        for(int k=i+1;k<=j-1;k+=2){
            int lt,lf,rt,rf;
            if(hm.containsKey(i+" "+(k-1)+" "+true))
            lt=hm.get(i+" "+(k-1)+" "+true);
            else{
                lt=memoizedEvaluateTrue(s, i, k-1, true)%1003;
            }
            if(hm.containsKey(i+" "+(k-1)+" "+false))
            lf=hm.get(i+" "+(k-1)+" "+false);
            else{
                lf=memoizedEvaluateTrue(s, i, k-1, false)%1003;

            }
            if(hm.containsKey((k+1)+" "+j+" "+true))
            rt=hm.get(k+1+" "+j+" "+true);
            else{
                rt=memoizedEvaluateTrue(s, k+1, j, true)%1003;
     
            }
            if(hm.containsKey((k+1)+" "+j+" "+false))
            rf=hm.get(k+1+" "+j+" "+false);
            else{
                rf=memoizedEvaluateTrue(s, k+1, j, false)%1003;
      
            }
            if(s.charAt(k)=='|'){
                if(isTrue)
                ans+=(lt*rt)+(lf*rt)+(lt*rf);
                else
                ans+=lf*rf;
            }
            if(s.charAt(k)=='&'){
                if(isTrue)
                ans+=lt*rt;
                else
                ans+=(lf*rf)+(lf*rt)+(lt*rf);
            }
            if(s.charAt(k)=='^'){
                if(isTrue)
                ans+=(lt*rf)+(lf*rt);
                else
                ans+=(lt*rt)+(lf*rf);
            }

        }
        hm.put(check, ans%1003);
        return ans%1003;
    }
}