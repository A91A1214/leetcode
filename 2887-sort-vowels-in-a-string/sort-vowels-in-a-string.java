import java.util.Arrays;
class Solution {
    public String sortVowels(String s) {
        char[] a=s.toCharArray();
        int n=s.length();
        char[] m=new char[n];
        int j=0;
        for(int i=0;i<n;i++){
        if(a[i]=='A' ||a[i]=='E' ||a[i]=='I' ||a[i]=='O' ||a[i]=='U' || a[i]=='a' ||a[i]=='e' ||a[i]=='i' ||a[i]=='o' ||a[i]=='u'){
            m[j]=a[i];
            a[i]='0';
            j++;
        }
        else{
            a[i]=s.charAt(i);
        }
        }
        Arrays.sort(m,0,j);
        int k=0;
        for(int i=0;i<n;i++){
        if(a[i]=='0'){
            a[i]=m[k];
            k++;
        }
        }
        // String st=new String(a);
        return new String(a);
    }
}