class Solution {
    public int hammingWeight(int n) {
        int count = 0;
        int mask = 1;
        for ( int i =0; i < 32; i ++){
            if((mask & n)==1){
                count++;
            }
            n = n>>1;
        }
        return count;
    }
}