class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
     long sum=0;
     long ans=0;
     HashMap<Integer,Integer>hm=new HashMap<>();
    for(int i=0;i<k;i++){
        sum+=nums[i];
        hm.put(nums[i],hm.getOrDefault(nums[i],0)+1);
    }
    if(hm.size()==k){
        ans=sum;
    }
    int l=0;
    for(int r=k;r<nums.length;r++){
        sum-=nums[l];
        hm.put(nums[l],hm.get(nums[l])-1);
        if(hm.get(nums[l])==0) 
        {
            hm.remove(nums[l]);
        }
        l++;
        sum+=nums[r];
         hm.put(nums[r],hm.getOrDefault(nums[r],0)+1);
         if(hm.size()==k){
            ans=Math.max(ans,sum);
         }
    }
    return ans;
   
    }
}