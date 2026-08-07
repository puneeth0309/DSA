class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>>hm=new HashMap<>();
        for(int i=0;i<strs.length;i++){
            char[] chars=strs[i].toCharArray();
            Arrays.sort(chars);
            String str=new String(chars);
            hm.computeIfAbsent(str,k -> new ArrayList<>()).add(strs[i]);
        }
        return new ArrayList<>(hm.values());
    }
}