class Solution {
    public boolean isPowerOfTwo(int n) {
    //    int a=n/2;
    //    int x=Math.pow(2 ,a);
    //     if(n==1 || n==x){
    //         return true;
    //     }
    //     return false;
    if(n==1){
        return true;
    }
    for(int i=1;i<31;i++){
        int x=(int)Math.pow(2,i);
        if(x==n){
            return true;
        }
    }
    return false;
    }
}