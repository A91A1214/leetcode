class Solution {
    public int firstUniqChar(String s) {
        // char[] arr=new charArray();
        int[] k=new int[26];
        for(char c: s.toCharArray()){
            k[c-'a']++;
        }
        for(int i=0;i<s.length();i++){
            if(k[s.charAt(i)-'a']==1){
                return i;
            }
        }
        return -1;
    }
}