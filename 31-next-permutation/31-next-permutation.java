class Solution {
    
    public void swap(int[] arr, int i, int j)
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    
    public void reverse(int[] arr, int left, int right)
    {
        while(left < right)
        {
            swap(arr, left++, right--);
        }
    }
    
    public void nextPermutation(int[] arr) {
        
        // Edge case of empty array
        if(arr.length<=1 && arr==null)
            return;
        
        //find the breaking point of decreasing order from right
        int i=arr.length-2;
        while(i>=0 && arr[i]>=arr[i+1])
        {
            --i;
        }
        
        if(i>=0)
        {
            // find the point from right, which is greater than element at `i-index`
            int j= arr.length-1;
            while(arr[j]<=arr[i])
            {
                --j;
            }
            swap(arr, i, j);
        }
        
        reverse(arr, i+1, arr.length-1);
    }
}