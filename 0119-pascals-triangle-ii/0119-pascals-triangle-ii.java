class Solution {

    public List<Integer> getRow(int rowIndex) {
       List<List<Integer>> li = new ArrayList<>();
        for (int i = 0; i <= rowIndex; i++) {
            List<Integer> ans = new ArrayList<>();
            for (int j = 0; j < i + 1; j++) {
                if (j == 0 || i == j) {
                    ans.add(1);
                } else {
                    ans.add(li.get(i - 1).get(j) + li.get(i - 1).get(j - 1));
                }
            }
            li.add(ans);
        }
       return li.get(rowIndex);
    }
}
