class Solution {
    public int smallestNumber(int n, int t) {
        for(int i=n;i<=100;i++){
        int a=i;
        int r=1;
        while(a!=0){
            int x=a%10;
            r=r*x;
            a/=10; 
        }
      
        if(r%t==0)
            return i;
            // break;
        }
        return -1;
    }
}