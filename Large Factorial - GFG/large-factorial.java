//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class Main {
    // Driver code
    public static void main(String[] args) throws Exception {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            long a[] = new long[n];
            String[] str = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                a[i] = Long.parseLong(str[i]);
            }

            Solution ob = new Solution();
            
            long res[] = ob.factorial(a,n);
            
            for (int i=0; i<n; i++) {
                System.out.print(res[i] + " ");
            }
            System.out.println();
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    public long[] factorial(long a[], int n) {
        // code here
        long[] result = new long[n];
        long mod = 1000000007;
        long[] factorial = new long[1000001];
        factorial[0] = 1;
        for (int i = 1; i < 1000001; i++) {
            factorial[i] = (factorial[i - 1] * i) % mod;
        }
        for (int i = 0; i < n; i++) {
            result[i] = factorial[(int)a[i]];
        }
        return result;
    }
}