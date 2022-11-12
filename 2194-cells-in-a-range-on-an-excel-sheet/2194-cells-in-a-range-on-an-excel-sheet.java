class Solution {

    public List<String> cellsInRange(String s) {
        List<String> li = new ArrayList<>();
        int n = s.length();

        char c1 = s.charAt(0);
        char c2 = s.charAt(1);
        char c3 = s.charAt(3);
        char c4 = s.charAt(4);
        for (char i = c1; i <= c3; i++) {
            for (char j = c2; j <= c4; j++) {
                li.add("" + i + j);
            }
        }

        return li;
    }
}
