//{ Driver Code Starts
//Initial Template for Java


import java.io.*;
import java.util.*;
class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            String S = read.readLine();
            
            Solution ob = new Solution();
            System.out.println(ob.longestSubstrDistinctChars(S));
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution{
    static int longestSubstrDistinctChars(String S){
        int n=S.length();
        int i=0;
        int j=0;
        int max=0;
        HashSet<Character> set=new HashSet<>();
        while(j<n){
            
            if(set.contains(S.charAt(j))){
                while(set.contains(S.charAt(j))){
                    set.remove(S.charAt(i));
                    i++;
                }
                
            }
            set.add(S.charAt(j));
            
            max=Math.max(max,set.size());
            
            j++;
    
        }
        
        return max;
        
    }
}