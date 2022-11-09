class Solution {

    public int countGoodSubstrings(String s) {
        int i = 0;
        int j = 0;
        int count = 0;
        HashMap<Character, Integer> map = new HashMap<>();

        int n = s.length();
        while (j < n) {
            if (!map.containsKey(s.charAt(i))) {
                map.put(s.charAt(j), 1);
            } else {
                map.put(s.charAt(j), map.getOrDefault(s.charAt(j),0)+1);
            }
            if (j - i + 1 == 3) {
                if (map.size() == 3) {
                    count++;
                }
                int val = map.get(s.charAt(i));
                val--;
if(val==0){
                map.remove(s.charAt(i));
}else{
    map.put(s.charAt(i),val);
}

                i++;
            }

            j++;
        }

        return count;
    }
}
