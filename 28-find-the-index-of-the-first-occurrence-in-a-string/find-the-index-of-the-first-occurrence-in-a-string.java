class Solution {
    public int strStr(String haystack, String needle) {
        int n=needle.length();
        int m=haystack.length();
       char[] c1=haystack.toCharArray();
       char[] c2=needle.toCharArray();
    //    int j=0;
       for(int i=0;i<=m-n;i++){
         int j=0;
        while(j<n && c1[i+j]==c2[j]){
            j++;
        } 
        if(n==j) return i;

       }
      
       return -1;
    }
}















// class Solution {
//     public int strStr(String haystack, String needle) {
//         int n=needle.length();
//         for(int i=0;i<haystack.length()-n+1;i++){
//           if(haystack.substring(i,i+n).equals(needle)){
//             return i;
//           }
//         }
//         return -1;
//     }
//      }