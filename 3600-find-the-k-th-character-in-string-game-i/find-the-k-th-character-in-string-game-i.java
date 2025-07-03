class Solution {
    public char kthCharacter(int k) {
        // char
        StringBuilder sb=new StringBuilder("a");
        // int s=sb.length();
        while(sb.length()<k){
            int size=sb.length();
            for(int i=0;i<size;i++){
                sb.append((char) ('a'+((sb.charAt(i)-'a')+1)%26));
            }
        }
        return sb.charAt(k-1);
    }
}