class Solution {

    public int[] pivotArray(int[] nums, int pivot) {
        int n = nums.length;
        int[] a = new int[n];
        int l = 0;
        for (int i = 0; i < n; i++) {
            if (nums[i] < pivot) {
                a[l++] = nums[i];
            }
        }
        for (int i = 0; i < n; i++) {
            if (nums[i] == pivot) {
                a[l++] = nums[i];
            }
        }
        for (int i = 0; i < n; i++) {
            if (nums[i] > pivot) {
                a[l++] = nums[i];
            }
        }
        return a;
    }
}
