class Solution {
    public int findShortestSubArray(int[] nums) {
        int[] count = new int[50_000];
        int[] first = new int[50_000];
        
        int degree = 0;
        int bestLen = nums.length;

        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            count[num]++;

            if (count[num] == 1) {
                first[num] = i;
            }

            if (count[num] > degree) {
                degree = count[num];
                bestLen = i - first[num] + 1;
            } else if (count[num] == degree) {
                int len = i - first[num] + 1;
                
                if (len < bestLen) {
                    bestLen = len;
                }
            }
        }

        return bestLen;

    }
}