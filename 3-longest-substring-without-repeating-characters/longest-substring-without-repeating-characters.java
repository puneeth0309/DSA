class Solution {
    public int lengthOfLongestSubstring(String s) {
         int n=s.length();
         int len=0;
        int l=0;
        
        int max=0;
        HashMap <Character,Integer> hm =new HashMap<>();
        for(int r=0;r<n;r++)
        {
            char ch=s.charAt(r);
            
       
           if(hm.containsKey(ch)){
             l=Math.max(l,hm.get(ch)+1);
             
           } 
             hm.put(ch,r);
             
             max=Math.max(max,r-l+1);
        }  
        return max;       
    }
}