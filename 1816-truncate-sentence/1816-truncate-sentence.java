class Solution {
    public String truncateSentence(String s, int k) {
        String[] ar=s.split(" ");
        String str=" ";
        for(int i=0;i<k;i++){
            str+=ar[i];
            str+=" ";
        }
        
        return str.trim();
        
        
    }
}