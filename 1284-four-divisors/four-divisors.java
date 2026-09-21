// class Solution {
//     public int sumFourDivisors(int[] nums) {
//         int n=nums.length;
//         int t=0;
//         for(int i=0;i<n;i++){
//             int sum=0,count=0;
//             for(int j=1;j<=nums[i];j++){
//                 if(nums[i]%j==0){
//                     sum+=j;
//                     count++;
//                 }
//             }
//              if(count==4){
//              t+=sum;
//             }
//         }
//         return t;
//     }
// }
class Solution {
    public int sumFourDivisors(int[] nums) {

        int t = 0;

        for(int i = 0; i < nums.length; i++) {

            int sum = 0;
            int count = 0;

            for(int j = 1; j * j <= nums[i]; j++) {

                if(nums[i] % j == 0) {

                    sum += j;
                    count++;

                    int other = nums[i] / j;

                    if(j != other) {
                        sum += other;
                        count++;
                    }
                }

                if(count > 4) {
                    break;
                }
            }

            if(count == 4) {
                t += sum;
            }
        }

        return t;
    }
}