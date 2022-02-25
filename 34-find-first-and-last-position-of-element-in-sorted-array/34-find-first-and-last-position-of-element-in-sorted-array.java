class Solution {
    public int[] searchRange(int[] arr, int key) {
        int left=0, right=arr.length-1;
        
        int[] res = new int[2];
        while(left<=right)
        {
            if(arr[left]!=key)
                left++;
            if(arr[right]!=key)
                right--;
            
            if(left>right)
                break;
            
            if(arr[left]==key && arr[right]==key)
                break;
        }
        
        if(left>right)
        {
            res[0]=-1;
            res[1]=-1;
        }
        else
        {
            res[0] = left;
            res[1] = right;
        }
        
        return res;
    }
}