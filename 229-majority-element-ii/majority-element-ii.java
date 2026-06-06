class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n=nums.length;
        int ans=0;
        List<Integer> ls=new ArrayList<>();
        
        HashMap<Integer,Integer>hm=new HashMap<>();
		for(int i=0;i<n;i++)
		{
		    int s=nums[i];
		   hm.put(s,hm.getOrDefault(s,0)+1);
		}
        for(int s:hm.keySet()){
		        
                 if(hm.get(s)>n/3){
                    ls.add(s);
                    
                 }
		    }
            return ls;
        
    }
}