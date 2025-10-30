class Solution {
    public int smallestNumber(int n) {
        int r = 0;
        int n1 = n;
        while (true) {
            int c1 = Integer.bitCount(n1);
            int len = Integer.toBinaryString(n1).length();
            if (c1 == len) {
                r = n1;
                break;
            }
            n1 = n1 + 1;
        }
        return r;
    }
}
