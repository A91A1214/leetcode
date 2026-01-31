class Solution {
    public int[] runningSum(int[] nums) {
        int n=nums.length;
        int k[]=new int[n];
        int s=0;
        for(int i=0;i<n;i++){
            s+=nums[i];
            k[i]=s;
        }
        return k;
    }
}