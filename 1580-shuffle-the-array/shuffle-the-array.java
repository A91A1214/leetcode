class Solution {
    public int[] shuffle(int[] nums, int n) {
        int m=nums.length;
        int r[]=new int[m];
        int j=0;
        for(int i=0;i<n;i++){
            r[j++]=nums[i];
            r[j++]=nums[n+i];
        }
        return r;
    }
}