class Solution {
    public boolean isAnagram(String s, String t) {
        char[] a=s.toCharArray();
         char[] b=t.toCharArray();
         Arrays.sort(a);
         Arrays.sort(b);
         String x=new String(a);
         String y=new String(b);
         if(x.equals(y)){
            return true;
         }
         return false;
    }
}