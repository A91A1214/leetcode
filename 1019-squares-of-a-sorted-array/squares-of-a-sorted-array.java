class Solution {
    public int[] sortedSquares(int[] nums) {
        int n=nums.length;
        int k[]=new int[n];
        for(int i=0;i<n;i++){
            k[i]=nums[i]*nums[i];
        }
        Arrays.sort(k);
        return k;
    }
}