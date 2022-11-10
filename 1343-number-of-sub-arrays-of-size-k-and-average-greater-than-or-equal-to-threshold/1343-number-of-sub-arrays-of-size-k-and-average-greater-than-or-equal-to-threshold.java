class Solution {

    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int i = 0;
        int j = 0;
        int count = 0;
        int sum = 0;
        int n = arr.length;
        while (j < n) {
            sum += arr[j];
            if (j - i + 1 == k) {
                int t = sum / k;
                if (t >= threshold) {
                    count++;
                }
                sum -= arr[i];
                i++;
            }

            j++;
        }

        return count;
    }
}
