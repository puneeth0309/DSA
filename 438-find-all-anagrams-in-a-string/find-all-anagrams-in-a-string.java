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
       int l=0;
       for(int r=p.length();r<s.length();r++){
         st[s.charAt(l)-'a']--;
         st[s.charAt(r)-'a']++;
          if(Arrays.equals(st,pt)){ 
            ls.add(l+1);
          }
          l++;
       }
       return ls;
    }
}