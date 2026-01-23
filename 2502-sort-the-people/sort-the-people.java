class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        HashMap<Integer,String> m=new HashMap<>();
        int n=heights.length;
        for(int i=0;i<n;i++){
            m.put(heights[i],names[i]);
        }
        List<Map.Entry<Integer,String>> list=new ArrayList<>(m.entrySet());
        list.sort((a,b)->b.getKey() - a.getKey());
        String s[]=new String[n];
        int i=0;
        for(Map.Entry<Integer,String> e:list){
            s[i++]=e.getValue();
        }
return s;
    }
}