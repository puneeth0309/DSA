class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        HashMap<Integer,Integer>hm=new HashMap<>();
        hm.put(0,1);
        int prefix=0;
        int target=0;
        int count=0;
        for(int i=0;i<nums.length;i++){
              prefix+=nums[i];
              target=prefix%k;
              if(target<0) target+=k;
    
              if(hm.containsKey(target)){

                count+=hm.get(target);
              }
              hm.put(target,hm.getOrDefault(target,0)+1);
        }
          return count;
    }
}