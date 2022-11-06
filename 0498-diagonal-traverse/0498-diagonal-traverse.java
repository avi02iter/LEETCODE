class Solution {

    public int[] findDiagonalOrder(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;
        int[] ans = new int[m * n];
        int r = 0;
        int c = 0;

        if (m == 0 || n == 0) {
            return new int[0];
        }
        for (int i = 0; i < ans.length; i++) {
            ans[i] = mat[r][c];
            if ((r + c) % 2 == 0) { //if even digonal then move up else move down
                if (c==n-1) { //like 1 here
                    r++; //to column ko aage badha do
                } else if (r==0) { //agar last column tak pahuch gye
                    c++; //niche row me aa jaoo like here 3
                } else {
                    r--;
                    c++; //if all normal the up move in diagonal like 7 here
                }
            } else { //move down
                if (r==m-1) { //like 4 here
                    c++; //ek row niche aa jaoo like 4 se 7 tak
                } else if (c==0) { //row me last me phuch gye then
                    r++; //ek column aage badha do like 8 to 9 here
                } else {
                    //normal move in digonal down
                    r++;
                    c--;
                }
            }
        }
        return ans;
    }
}



