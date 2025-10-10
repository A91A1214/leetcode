// class Solution {
//     public int strStr(String haystack, String needle) {
//         int n=needle.length();
//         int m=haystack.length();
//         for(int i=0;i<m-n;i++){
//             if(haystack.equals(needle)){
//                 return i;
//             }
//         }
//         return -1;
//     }
// }















class Solution {
    public int strStr(String haystack, String needle) {
        int n=needle.length();
        for(int i=0;i<haystack.length()-n+1;i++){
          if(haystack.substring(i,i+n).equals(needle)){
            return i;
          }
        }
        return -1;
    }
}