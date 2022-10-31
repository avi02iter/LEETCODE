class Solution {

    public int[] countBits(int n) {
        //         int[] ans = new int[n + 1];
        //         int count = 0;
        //         for (int i = 0; i < n+1; i++) {
        //             while (i >= 0) {
        //                 int rem = i % 2;
        //                 if (rem == 1) {                      //brute force
        //                     count++;
        //                 }
        //                 i/= 2;
        //                 ans[i] = count;
        //             }
        //         }

        //         return ans;

        //by dp (tabulation)
        int[] dp = new int[n + 1];
        dp[0] = 0;
        //dp[1] = 1;
        for(int i=1;i<n+1;i++){
            if(i%2==0){
                dp[i]=dp[i/2];
            }else{
                dp[i]=dp[i/2]+1;
            }
        }
        
        return dp;
    }
}
