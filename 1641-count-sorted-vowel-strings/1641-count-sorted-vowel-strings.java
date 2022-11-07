class Solution {

    int ax[] = { 0 };
    public int countVowelStrings(int n) {
      solve(0, 0, n);
        
        return ax[0];
    }

    void solve(int idx, int count, int n) {
       if(count>n )
           return;
       
        
        if(count==n){
            ax[0]++;
            return;
        }
        
        
        for(int i=idx;i<5;i++)
        solve(i, count+1, n);       
        

    }
}
