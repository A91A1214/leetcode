class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
         int n1=nums1.length;
         int n2=nums2.length;
         int m[]=new int[n1];
         for(int i=0;i<n1;i++){
            int num=nums1[i];
            int t=-1;
            for(int j=0;j<n2;j++){
                if(nums2[j]==num){
                    t=j;
                    break;
                }
            }
            int n=-1;
            for(int k=t+1;k<n2;k++){
                if(nums2[k]>num){
                    n=nums2[k];
                    break;
                }
            }
            m[i]=n;
         }

        // int n1=nums1.length;
        // int n2=nums2.length;
        // int m[]=new int[n2];
        // for(int i=0;i<n2;i++){
        //     for(int j=0;j<n1;j++){
        //         if(nums1[i]==nums2[j]){
        //             if(nums2[j]<=nums2[j++]){
        //             m[j]=nums2[j++];
        //             }
        //             m[j]=-1;
        //         }
        //         nums2[j]++;
        //     }
        // }
        // return m;
return m;
    }
}