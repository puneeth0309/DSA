class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
         if (k <= 1) return 0;
        int l=0,r=0;
        int count=0;
        int product=1;
        for(r=0;r<nums.length;r++){
            product*=nums[r];
            while(product>=k){
                product/=nums[l];
                l++;
            }
            if(product<k){
                count+=r-l+1;
            }

        }
        return count;
    }
}