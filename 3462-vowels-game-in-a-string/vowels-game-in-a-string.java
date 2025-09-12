class Solution {
    public boolean doesAliceWin(String s) {
        char[] c=s.toCharArray();
        int n=s.length();
        String x="aeiou";
        char[] m=new char[n];
        int j=0;
        for(int i=0;i<n;i++){
            if(x.indexOf(c[i])!=-1){
                m[j]=c[i];
                j++;
            }
        }
        int y=m.length;
        int cnt=0;
        for(int i=0;i<j;i++){
            cnt++;
        }
        if((cnt%2!=0 && cnt!=0)||(cnt%2==0 &&cnt!=0 ))return true;
        return false;
    }
}