class Solution {

    public int[] searchRange(int[] nums, int target) {
        int[] a = new int[2];
        int n = nums.length;
        int f = binaryfirst(nums, target, n);
        int l = binaryLast(nums, target, n);
        a[0] = f;
        a[1] = l;

        return a;
    }

    public int binaryfirst(int[] nums, int target, int n) {
        int start = 0;
        int end = n - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] == target) {
                if (mid-1>=0&&nums[mid - 1] == target) {
                    end = mid - 1;
                } else {
                    return mid;
                }
            } else if (nums[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return -1;
    }

    public int binaryLast(int[] nums, int target, int n) {
        int start = 0;
        int end = n - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] == target) {
                if (mid+1<nums.length&&nums[mid + 1] == target) {
                    start = mid + 1;
                } else {
                    return mid;
                }
            } else if (nums[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return -1;
    }
}
