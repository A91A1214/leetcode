class Solution {
    public int alternateDigitSum(int n) {
        String s = String.valueOf(n);
        int factor = 1;
        int res = 0;

        for (char chr : s.toCharArray()) {
            res += (Character.getNumericValue(chr) * factor);
            factor *= -1;
        }
        return res;
    }
}
// class Solution {
//     public int alternateDigitSum(int n) {
//         String s=String.valueOf(n);
//         char[] c=s.toCharArray();
//         for(int i=0;i<c.length()-1;i++){

//         }
//     }
// }