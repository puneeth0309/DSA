class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int i=0;
        int[] arr= new int[2];
        int j=numbers.length-1;
        int sum=0;
        while(i<j){
            sum=numbers[i]+numbers[j];
            if(sum==target){
                arr[0]=i+1;
                arr[1]=j+1;
                break;
            }
            if(sum>target){
                j--;

            }
            if(sum<target){
                i++;
            }
        }
        return arr;
        
    }
}