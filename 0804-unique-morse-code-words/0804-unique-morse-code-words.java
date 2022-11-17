class Solution {

    public int uniqueMorseRepresentations(String[] words) {
        int n = words.length;
        HashSet<String> set = new HashSet<>();

        String[] code = {
            ".-",
            "-...",
            "-.-.",
            "-..",
            ".",
            "..-.",
            "--.",
            "....",
            "..",
            ".---",
            "-.-",
            ".-..",
            "--",
            "-.",
            "---",
            ".--.",
            "--.-",
            ".-.",
            "...",
            "-",
            "..-",
            "...-",
            ".--",
            "-..-",
            "-.--",
            "--.."
        };
        for (int i = 0; i < n; i++) {
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < words[i].length(); j++) {
                sb.append(code[words[i].charAt(j) - 'a']);
            }
            set.add(sb.toString());
        }

        return set.size();
    }
}
