class Solution {

    public int minOperations(int[] nums) {
        int count = 0;
        int currentMax = nums[0];

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] <= ++currentMax) {
                count += currentMax - nums[i];
            }
            currentMax = Math.max(currentMax, nums[i]);
        }

        return count;
    }
}