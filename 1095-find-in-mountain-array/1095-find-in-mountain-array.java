/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index) {}
 *     public int length() {}
 * }
 */
 
class Solution {
    
    public int findInMountainArray(int key, MountainArray arr) {
        int left=0, right=arr.length()-1;
        
        while(left < right)
        {
            int mid = left + (right-left)/2;
            if( arr.get(mid) < arr.get(mid+1) )
                left=mid+1;
            else
                right=mid;
        }
        
        int peak=left;
        left=0; right=arr.length()-1;
        
        int leftFound = binarySearch(arr, key, left, peak);
        int rightFound=-1;
        if(leftFound != -1)
            return leftFound;
        else
        {
            return rightFound = binarySearch(arr, key, peak+1, right);
        }
        
    }
    
    public int binarySearch(MountainArray arr,int key, int left, int right)
    {
        if(arr.get(left) < arr.get(right))
        {
            while(left<=right)
            {
                int mid = left + (right-left)/2;
                if(arr.get(mid) == key)
                    return mid;
                else if(arr.get(mid)<key)
                    left=mid+1;
                else
                    right=mid-1;
            }
            
            return -1;
        }
        else
        {
            while(left <= right)
            {
                int mid = left + (right-left)/2;
            if(arr.get(mid)==key)
                return mid;
            else if(arr.get(mid)<key)
                right=mid-1;
            else
                left=mid+1;
            }
    
            return -1;
        }
    }
    
}