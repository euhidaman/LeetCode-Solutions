class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] res = new int[nums.length];
        int l = 0, r=n;
        
        for(int i=0; i<nums.length; i++)
        {
            if(i%2 == 0)
            {
                res[i] = nums[l++];
            } 
            else
            {
                res[i] = nums[r++];
            }
        }
        
        return res;
    }
}