class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer,Integer>hm=new HashMap<>();
         hm.put(0, 1);
        int prefix=0;
        int target=0;
        int count=0;
        for(int i=0;i<nums.length;i++){
            prefix+=nums[i];
            target=prefix-k;
            if(hm.containsKey(target)){
             count+=hm.get(target);
            }
            hm.put(prefix,hm.getOrDefault(prefix,0)+1);
        }
        return count;
    }
}