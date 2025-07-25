import java.util.Arrays;
class Solution {
    public int maxSum(int[] nums) {
        Arrays.sort(nums); // \U0001f503 Sort the array
        int lastSeen = nums[nums.length - 1];
        int sum = lastSeen;
        for (int i = nums.length - 2; i >= 0; i--) {
            int current = nums[i];
            if (current <= 0) return sum; // \U0001f6ab Ignore non-positives
            if (current != lastSeen) sum += current; // ✅ Add if unique
            lastSeen = current;
        }
        return sum; // \U0001f3af Final result
    }
}
// class Solution {
//     public int maxSum(int[] nums) {
//         if (nums == null || nums.length == 0) {
//             return 0; // Handle empty or null array
//         }

//         Set<Integer> uniqueNumbers = new HashSet<>();
//         int sumOfUnique = 0;

//         for (int num : nums) {
//             if (uniqueNumbers.add(num)) { // add() returns true if the element was added (i.e., it's unique)
//                 sumOfUnique += num;
//             }
//         }
//         return sumOfUnique;
//     }
// }
// // int n=nums.length;
// //         // int s1=0,s2=0;
// //         // Arrays.sort(nums);
// //         // int j=0;
// //         // for(int i=1;i<n-1;i++){
// //         //     if(nums[i]!=nums[j]){
// //         //         j++;
// //         //         nums[j]=nums[i];
// //         //         s1+=nums[j];
// //         //     }
// //         //     else{
// //         //         if(nums[i]!=nums[i+1]){
// //         //         s1+=nums[i];
// //         //         }
// //         //     }
// //         // }
// //         // return Math.max(s1,s2);
// //         if (nums == null || nums.length == 0) {
// //             return 0;
// //         }

// //         Arrays.sort(nums); // Sort the array

// //         int sumOfUnique = nums[0]; // Start with the first element, as it's unique
// //         // The `j` pointer logic used in your original code:
// //         // This loop essentially iterates through the sorted array and sums only the distinct elements.
// //         // It's effectively counting/summing unique elements after sorting.
// //         for (int i = 1; i < nums.length; i++) {
// //             if (nums[i] != nums[i - 1]) { // If current element is different from the previous one
// //                 sumOfUnique += nums[i]; // Add it to the sum
// //             }
// //         }
// //         return sumOfUnique;
    