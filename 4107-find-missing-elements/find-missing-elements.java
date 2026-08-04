class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        Arrays.sort(nums);
        List<Integer> list=new ArrayList<>();
       int n=nums.length;
       
        int l=0,r=1;
        while(r<n){
           if(nums[r]-nums[l]>1){
            
            for(int i=nums[l]+1;i<nums[r];i++){
                list.add(i);
            }
           }
           l++;
            r++;
           
        }
return list;
    } 
}