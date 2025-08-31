class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n = nums.length;
        int[] nge = new int[n];
        for (int i = 0; i < n; i++) {
            nge[i] = -1; 
            for (int step = 1; step < n; step++) {
                int idx = (i + step) % n;
                if (nums[idx] > nums[i]) {
                    nge[i] = nums[idx];
                    break; 
                }
            }
        }
        return nge;
    }
}