class Solution {
    public List<Integer> findAnagrams(String s, String p) {
      List<Integer>ls=new ArrayList();
      int[] st=new int[26];  
       int[] pt=new int[26];
       if (s.length() < p.length()) return ls;
       for(int i=0;i<p.length();i++){
          st[s.charAt(i)-'a']++;
          pt[p.charAt(i)-'a']++;

       }
       if(Arrays.equals(st,pt)) ls.add(0);
       for(int i=p.length();i<s.length();i++){
         st[s.charAt(i)-'a']++;
         st[s.charAt(i-p.length())-'a']--;
          if(Arrays.equals(st,pt)){ 
            ls.add(i-p.length()+1);
          }
       }
       return ls;
    }
}