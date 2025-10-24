class Solution {
    public int[] replaceElements(int[] arr) {
     int p=-1;
     int n=arr.length;
     for(int i=n-1;i>=0;i--){
        int t=arr[i];
        arr[i]=p;
        if(t>p){
            p=t;
        }
     }
     return arr;
    }
}