class Solution {
    public int longestPalindrome(String s) {
        int n=s.length();
        // map<Integer , String> map=new Hashmap<>();
       int[] freq=new int[256];
        for(int i=0;i<n;i++){
            char c=s.charAt(i);
            freq[c]++;
        }
        int n1=freq.length;
        int e=0;
        boolean hasOdd = false;
        for(int j=0;j<n1;j++){
            if(freq[j]%2==0){
                e=e+freq[j];
            }
            else{
                e = e + (freq[j] - 1);
                hasOdd = true;

            }
            // else{
            //     if(freq[j]>=max){
            //         max=freq[j];
            //     }
            // }
        }
        int sum = hasOdd ? e+1 : e;
        return sum;

    }
}