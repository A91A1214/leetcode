class Solution {
    public int findSpecialInteger(int[] arr) {
        int n = arr.length;
        for(int i = 0; i < n; i++) {
            int count = 0;
            for(int j = 0; j < n; j++) {
                if(arr[i] == arr[j]) count++;
            }
            if(count > n / 4) return arr[i];
        }
        return -1;
    }
}











// class Solution {
//     public int findSpecialInteger(int[] arr) {
//         int n=arr.length;
//         int c=0;
//         int t=0;
//         for(int i=0;i<n-1;i++){
//                 if(arr[i]==arr[i+1]){
//                     c++;
//             }
//         }
//         // if(c>t){
//         //     t=c;
//         // } 
//         return c;
//     }
// }