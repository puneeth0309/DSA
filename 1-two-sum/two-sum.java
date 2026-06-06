class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] a=new int[2];
        Map<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            int first=target-nums[i];
            if(map.containsKey(first))
            {
                a[0]=map.get(first);
                a[1]=i;
                break;
            }
          map.put(nums[i],i);  
        }
        return a;
        
    }
}