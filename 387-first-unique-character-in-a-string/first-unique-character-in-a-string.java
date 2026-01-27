class Solution {
    public int firstUniqChar(String s) {
        HashMap<Character,Integer> m=new HashMap<>();
        char[] a=s.toCharArray();
        for(char c:a){
            m.put(c,m.getOrDefault(c,0)+1);
        }
        for(int i=0;i<a.length;i++){
            if(m.get(a[i])==1){
                return i;
            }
        }
        return -1;
        
    }
}