//{ Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0)
        {
            int N=sc.nextInt();
			ArrayList<Integer> arr = new ArrayList<>();
			for(int i = 0; i < N ; i++){
			    arr.add(sc.nextInt());
			}
            Solution ob = new Solution();
         
            ArrayList<Integer> ans = ob.subsetSums(arr,N);
            Collections.sort(ans);
            for(int sum : ans){
                System.out.print(sum+" ");
            }
            System.out.println();
        }  
    }
}

// } Driver Code Ends


//User function Template for Java//User function Template for Java
class Solution{
    ArrayList<Integer> subsetSums(ArrayList<Integer> arr, int N){
        ArrayList<Integer> li=new ArrayList<>();
       helper(0,0,N,arr,li);
       return li;
       
    }
    
    void helper(int i,int sum,int N,ArrayList<Integer> arr,ArrayList<Integer> li){
        if(i==N){
            li.add(sum);
            return ;
        }
        
        helper(i+1,sum+arr.get(i),N,arr,li);   //taking the number and adding it to sum
        helper(i+1,sum,N,arr,li);              //not taking the number , hence sum not added up
        
    }
}