class Solution {
    public int majorityElement(int[] nums) {
        int n=nums.length;
        int ans=0;
        
        HashMap<Integer,Integer>hm=new HashMap<>();
		for(int i=0;i<n;i++)
		{
		    int s=nums[i];
		   hm.put(s,hm.getOrDefault(s,0)+1);
		}
        for(int s :hm.keySet()){
		        
                 if(hm.get(s)>n/2){
                    ans= s;
                    break;
                    
                 }
		    }
            return ans;
        
		
	}
		    
		    
           
        
    }
    
