class Solution {
    public void moveZeroes(int[] nums) {
        
        int r=0;
        int l = -1;

for (int i = 0; i < nums.length; i++) {
    if (nums[i] == 0) {
        l = i;
        break;
    }
}

if (l == -1) {
    return;   
}
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){ 
                l=i;
                break;
            }

        }
        r=l+1;
        while(r<nums.length){
            if(nums[r]!=0){
                int temp=nums[r];
                nums[r]=nums[l];
                nums[l]=temp;
             l++;   
            }
            r++;
        }
        
    }
}