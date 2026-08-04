class Solution {
    public int numIdenticalPairs(int[] nums) {
        HashMap<Integer,Integer>hm=new HashMap<>();
        int ans=0;
		for(int i=0;i<nums.length;i++)
		{
		    int s=nums[i];
            ans+=hm.getOrDefault(s,0);
		   hm.put(s,hm.getOrDefault(s,0)+1);
		}
		    
		    
            return ans;
    }
}