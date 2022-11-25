class Solution {

    public String truncateSentence(String s, int k) {
        String[] ar = s.split(" ");
        //String str=" ";
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < k-1; i++) {
            sb.append(ar[i]+" ");
        }
        
        sb.append(ar[k-1]);

        return sb.toString();
    }
}
