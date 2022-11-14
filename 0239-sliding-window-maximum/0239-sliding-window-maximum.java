class Solution {

    public int[] maxSlidingWindow(int[] nums, int k) {
        int n = nums.length;
        int[] ans = new int[n-k+1];
        ArrayDeque<Integer> q = new ArrayDeque<>();
        int i = 0;
        int j = 0;
        int m = 0;
        while (j < n) {
            while (q.size() > 0 && q.peekLast() < nums[j]) {
                q.pollLast();
            }

            q.addLast(nums[j]);

            if (j - i + 1 == k) {
                ans[m++] = q.peekFirst();
                if (q.peekFirst() == nums[i]) {
                    q.pollFirst();
                }
                i++;
            }

            j++;
        }

        return ans;
    }
}
