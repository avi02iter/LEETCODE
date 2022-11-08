class Solution {

    public String sortSentence(String s) {
        String[] s1 = new String[s.split(" ").length];
        for (String str : s.split(" ")) {
            s1[str.charAt(str.length()-1)-'1'] = str.substring(0, str.length()-1);
        }

        return String.join(" ", s1);
    }
}
