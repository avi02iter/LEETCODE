class Solution {

    public boolean checkIfPangram(String sentence) {
//         boolean[] a = new boolean[26];
//         Arrays.fill(a, false);

//         for (int i = 0; i < sentence.length(); i++) {
//             char c = sentence.charAt(i);
//             int pos = c - 'a';
//             a[pos++] = true;
//         }

//         for (int i = 0; i < a.length; i++) {
//             if (a[i] == false) {
//                 return false;
//             }
//         }

//         return true;
        
        HashSet<Character> h=new HashSet<>();
        for(int i=0;i<sentence.length();i++){
            h.add(sentence.charAt(i));
        }
        
        if(h.size()!=26){
            return false;
        }
        
        return true;
        
        
    }
}
