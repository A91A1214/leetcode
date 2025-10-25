class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int n=nums.length;
        int[] m=new int[n];
        for(int i=0;i<n;i++){
             int c=0;
            int current=nums[i];
            for(int j=0;j<n;j++){
                if(nums[j]<current){
                    c++;
                  
                }
            }
              m[i]=c;
        }
        return m;
        }
}