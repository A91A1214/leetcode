class Solution {
    public int possibleStringCount(String word) {
        char[] ch=word.toCharArray();
        int c=1;
        int n=ch.length;
        for(int i=0;i<n-1;i++){
            if(ch[i]==ch[i+1]){
                c++;
            }
        }
        return c;
    }
}