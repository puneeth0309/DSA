class Solution {
    public int maxArea(int[] height) {
        int l=0;
        int r=height.length-1;
        int hie=0;
        int width=0;
        int area,max=0;
        while(l<=r){
          hie=Math.min(height[l],height[r]);
          width=r-l;
          area=hie*width;
          max=Math.max(area,max);
          if(height[l] <= height[r]) l++;
          else r--;
        }
         return max;
    }
}