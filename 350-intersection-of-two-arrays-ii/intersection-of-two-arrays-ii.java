// class Solution {
//     public int[] intersect(int[] nums1, int[] nums2) {
//         Set<Integer> x=new HashSet<>();
//         Set<Integer> n=new HashSet<>();
//         for(int i:nums1){
//             x.add(i);
//         }
//        // int n2=nums2.length();
//         for(int i:nums2){
//             if(x.contains(i)){
//                n.add(i); 
//             }
//         }
//         int[] m=new int[n.size()];
//         int j=0;
//         for(int i:n){
//             m[j++]=i;
//         }
//         return m;
//     }
// }


import java.util.*;

class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer, Integer> countMap = new HashMap<>();
        for (int num : nums1) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }

        List<Integer> res = new ArrayList<>();
        for (int num : nums2) {
            if (countMap.getOrDefault(num, 0) > 0) {
                res.add(num);
                countMap.put(num, countMap.get(num) - 1);
            }
        }

        int[] result = new int[res.size()];
        for (int i = 0; i < res.size(); i++) result[i] = res.get(i);
        return result;
    }
}