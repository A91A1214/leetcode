// class Solution {
//     public int compareVersion(String version1, String version2) {
//         int n1=version1.length();
//         int n2=version2.length();
//         for(int i=0;i<n1;i++){
//         char c1=version1.charAt(i);
//         }
//         for(int i=0;i<n2;i++){
//         char c2=version2.charAt(i);
//         }
//         while(c1=='.' && c2=='.'){
//             if(version1.charAt(i+1)<version2.charAt(i+1)){
//                 return -1;
//             }
//             else{
//                 return 1;
//             }
//         }
//         return 0;
//     }
// }


class Solution {
    public int compareVersion(String version1, String version2) {
        String[] v1=version1.split("\\.");
        String[] v2=version2.split("\\.");

        int l=Math.max(v1.length, v2.length);
        for(int i=0;i<l;i++){
            int n1=i<v1.length? Integer.parseInt(v1[i]):0;
            int n2=i<v2.length? Integer.parseInt(v2[i]):0;
            if(n1<n2) return -1;
            if(n1>n2) return 1;
        }
        return 0;
    }

}