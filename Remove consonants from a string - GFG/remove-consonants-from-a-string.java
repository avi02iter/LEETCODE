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
                    Solution ob = new Solution();
                    System.out.println(ob.removeConsonants(s));
                }
        }
}    
// } Driver Code Ends


//User function Template for Java

class Solution
{
    public String removeConsonants(String s)
    {
        StringBuilder sb = new StringBuilder();
        String str = s.toLowerCase();
        
        for(int i=0; i<s.length(); i++){
            if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'
            ||str.charAt(i)=='u'){
                sb.append(s.charAt(i));
            }
        }
        if(sb.length()==0){
            return "No Vowel";
        }
        return sb.toString();
    }
    
}
