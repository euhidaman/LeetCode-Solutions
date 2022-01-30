class Solution {
    public void rotate(int[] nums, int k) {
        int len = nums.length;
        
        k%=len;
        
        int left=0, right=len-k-1;
        while(left<=right)
        {
            int temp = nums[left];
            nums[left]=nums[right];
            nums[right]=temp;
            
            ++left;
            --right;
        }
        
       left = len-k; right = len-1;
        while(left<=right)
        {
            int temp = nums[left];
            nums[left]=nums[right];
            nums[right]=temp;
            
            ++left;
            --right;
        }
        
        left=0; right=len-1;
        while(left<=right)
        {
            int temp = nums[left];
            nums[left]=nums[right];
            nums[right]=temp;
            
            ++left;
            --right;
        }
    }
}