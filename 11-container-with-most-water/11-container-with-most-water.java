class Solution {
    public int maxArea(int[] height) {
        int water =0, left=0, right=height.length-1;
        
        while(left < right)
        {
            int minHeight = Math.min(height[left], height[right]);
            int currentWater = minHeight*(right-left);
            
            water = Math.max(water, currentWater);
            
            if(height[left] > height[right])
                --right;
            else
                ++left;
        }
        
        return water;
    }
}