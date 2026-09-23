class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map=new HashMap<>();
        for(String s:strs){
            char[] arr=s.toCharArray();
            Arrays.sort(arr);

        String st=new String(arr);
        if(!map.containsKey(st)){
            map.put(st,new ArrayList<>());
        }
        map.get(st).add(s);
        }

        return new ArrayList<>(map.values());
    }
}