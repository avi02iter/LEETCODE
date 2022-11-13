class Solution {

    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> ls = new ArrayList<>();
        HashMap<Character, Integer> hm = new HashMap<>();
        for (int i = 0; i < p.length(); i++) {
            if (!hm.containsKey(p.charAt(i))) hm.put(p.charAt(i), 1); else {
                hm.put(p.charAt(i), hm.get(p.charAt(i)) + 1);
            }
        }
        int ct = hm.size();
        int i = 0;
        int j = 0;
        int k = p.length();
        while (j < s.length()) {
            char ch = s.charAt(j);
            if (hm.containsKey(ch)) {
                hm.put(ch, hm.get(ch) - 1);
                if (hm.get(ch) == 0) ct--;
            }
            // if (j - i + 1 < k) j++;
            if (j - i + 1 == k) {
                if (ct == 0) ls.add(i);
                if (hm.containsKey(s.charAt(i))) {
                    hm.put(s.charAt(i), hm.get(s.charAt(i)) + 1);
                    if (hm.get(s.charAt(i)) == 1) ct++;
                }
                i++;
                // j++;
            }
            j++;
        }
        return ls;
    }
}
