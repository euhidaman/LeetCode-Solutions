class Solution {
    public int[] searchRange(int[] nums, int target) {
        int res[] = new int[2];
        res[0] = firstFind(nums, target);
        res[1] = lastFind(nums, target);
        
        return res;
    }
    
    public int firstFind(int[] arr, int key)
    {
        int left=0, right=arr.length-1;
        int ind = -1;
        while(left<=right)
        {
            int mid = left + (right-left)/2;
            if(key <= arr[mid])
            {
                right=mid-1;
            }
            else
            {
                left=mid+1;
            }
            
            if(arr[mid]==key)
                ind = mid;
        }
        
        return ind;
    }
    
    public int lastFind(int[] arr, int key)
    {
        int left=0, right=arr.length-1;
        int ind = -1;
        while(left<=right)
        {
            int mid = left + (right-left)/2;
            if(arr[mid]<=key)
            {
                left=mid+1;
            }
            else
            {
                right=mid-1;
            }
            
            if(arr[mid]==key)
                ind = mid;
        }
        
        return ind;
    }
}