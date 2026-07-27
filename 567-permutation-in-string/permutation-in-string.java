class Solution {
    public boolean checkInclusion(String s1, String s2) {
     int [] a1=new int[26];
     int [] a2=new int[26];
     int l=0;
     if(s1.length()>s2.length()) return false;
     for(int i=0;i<s1.length();i++){
        a1[s1.charAt(i)-'a']++;
        a2[s2.charAt(i)-'a']++;
     }
     if(Arrays.equals(a1,a2)) return true;
     for(int r=s1.length();r<s2.length();r++){
        a2[s2.charAt(l)-'a']--;
        a2[s2.charAt(r)-'a']++;
        if(Arrays.equals(a1,a2)) return true;
        l++;
     }
     return false;
    }

}