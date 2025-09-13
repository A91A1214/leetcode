class Solution {
    public int maxFreqSum(String s) {
        HashMap<Character, Integer> v=new HashMap<>();
      HashMap<Character, Integer> c=new HashMap<>();
        String x="aeiouAEIOU";
        int n=s.length();
        int m1=0,m2=0;
        for(int i=0;i<n;i++){
            char ch=s.charAt(i);
            if(x.indexOf(s.charAt(i))!=-1){
               int count=v.getOrDefault(s.charAt(i),0)+1;
                v.put(s.charAt(i),count);
                m1=Math.max(m1,count);
            }
            else{
                int count=c.getOrDefault(s.charAt(i),0)+1;
                 c.put(s.charAt(i),count);
                m2=Math.max(m2,count);
            }
        }
        int sum=m1+m2;
        return sum;



    }
}