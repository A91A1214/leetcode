class Solution {
    public boolean isSameAfterReversals(int num) {
        int temp=num;
        int rev=0;
        int t;
        while(num!=0){
         t=num%10;
         rev=rev*10+t;
         num=num/10;
        }
        int rev2=0,re;
        while(rev!=0)
        {
            re=rev%10;
            rev2=rev2*10+re;
            rev=rev/10;
        }
        if(rev2==temp){
            return true;
        }
        else{
            return false;
        }
    }
}