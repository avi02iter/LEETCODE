class Solution {

    public int countKDifference(int[] nums, int k) {
        //int n = nums.length;
        int count = 0;
        //brute force
        //         for(int i=0;i<n;i++){
        //             for(int j=i+1;j<n;j++){
        //                 if(Math.abs(nums[i]-nums[j])==k){
        //                     count++;
        //                 }
        //             }
        //         }

        //         return count;

        //optimize by hashmap
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i] - k)) {
                count += map.get(nums[i] - k);
            }
            if (map.containsKey(nums[i] + k)) {
                count += map.get(nums[i] + k);
            }
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }

        return count;
    }
}
