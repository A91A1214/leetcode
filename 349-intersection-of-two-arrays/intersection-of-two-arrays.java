class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
                Set<Integer> r=new HashSet<>();
        Set<Integer> n1=new HashSet<>();
        for(int i:nums1){
            n1.add(i);
        }
        for(int i=0;i<nums2.length;i++){
            if(n1.contains(nums2[i])){
                r.add(nums2[i]);
            }
        }
        int[] result=new int[r.size()];
        int j=0;
        for(int i:r){
            result[j++]=i;
        }
return result;
    }
}