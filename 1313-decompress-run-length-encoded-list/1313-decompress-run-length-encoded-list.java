class Solution {
    public int[] decompressRLElist(int[] nums) {
        int len=0;
        for(int i=0; i<nums.length; i++)
        {
            if(i%2==0)
                len+=nums[i];
        }
        
        int[] res = new int[len];
        int ind = 0;
        
        for(int i=0; i<nums.length; i++)
        {
            if(i%2==0)
            {
                while(nums[i]-->0)
                {
                    res[ind++] = nums[i+1];
                }
            }
        }
        
        return res;
    }
}