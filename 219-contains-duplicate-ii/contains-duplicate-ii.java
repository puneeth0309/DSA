class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
             HashMap<Integer,Integer>hm=new HashMap<>();
             int ans=0;
             for(int i=0;i<nums.length;i++){
                if(hm.containsKey(nums[i])){
                    ans=Math.abs(i-hm.get(nums[i]));
                  if(ans<=k) return true;
                }
                hm.put(nums[i],i);
             }
             return false;
             
    }
}